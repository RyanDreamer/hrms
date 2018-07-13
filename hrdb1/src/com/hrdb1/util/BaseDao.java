package com.hrdb1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

/**
 * 用来做数据的一个基础连接、关闭、增、删、改、查
 * @author cher
 *
 */
public class BaseDao {
	
	//属性
	private String driver = ResourceBundle.getBundle("jdbc").getString("driver");
	private String url = ResourceBundle.getBundle("jdbc").getString("url");
	private String username = ResourceBundle.getBundle("jdbc").getString("username");
	private String password = ResourceBundle.getBundle("jdbc").getString("password");
	
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement pstmt;
	
	/**
	 * 数据库连接
	 * @return
	 */
	public Connection getConnection(){
		try {
			//加载数据库驱动
			Class.forName(driver);
			if(conn == null || conn.isClosed()){
				//用DriverManager进行数据库连接
				conn = DriverManager.getConnection(url, username, password);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	/**
	 * 通用 增 删 改
	 * @param sql
	 * @param params
	 * @return result影响的行数
	 * 或采用executeUpdate(String sql,Object[] params)方法
	 */
	public int executeUpdate(String sql,List<Object> params){
		int result = 0;
		//获取连接
		if(getConnection()==null){
			return -1;
		}
		try {
			//创建PreparedStatement对象
			pstmt = conn.prepareStatement(sql);
			//如果增、删、改，需要给SQL语句进行参数绑定
			if(params!=null && params.size()>0){
				//循环查询参数集合，因为不确定集合对象中每个字段带类型，因此采用pstmt.setObject()进行查询参数绑定
				for(int i=0;i<params.size();i++){
					pstmt.setObject(i+1, params.get(i));
				}
			}
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			//关闭数据库连接
			this.closeConnection();
		}
		return result;
	}
	/**
     * 执行数据库插入操作
     *
     * @param datas  key为列名和value为列对应的值的Map对象的List集合
     * @param sql 
     * @return 影响的行数
     * @throws SQLException SQL异常
     */
    public int executeUpdateAll(String sql, List<List< Object>> datas) {
        //影响的行数
        int affectRowCount = 0;
        //获取连接
      	if(getConnection()==null){
      		return -1;
      	}
        try {
           
            //执行SQL预编译
            pstmt = conn.prepareStatement(sql);
            //设置不自动提交，以便于在出现异常的时候数据库回滚
            conn.setAutoCommit(false);
            for (int i = 0; i < datas.size(); i++) {
            		List<Object> keys = datas.get(i);
                for (int j = 0; j < keys.size(); j++) {
                		pstmt.setObject(j+1, keys.get(j));
                }
                pstmt.addBatch();
            }
            int[] arr = pstmt.executeBatch();
            conn.commit();
            affectRowCount = arr.length;
            System.out.println("成功了插入了" + affectRowCount + "行");
            System.out.println();
        } catch (Exception e) {
          	e.printStackTrace();
            if (conn != null) {
            	try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
            }
            
        } finally {
        		//关闭数据库连接
			this.closeConnection();
        }
        return affectRowCount;
    }
	
	/**
	 * 通用查询方法
	 * @param sql
	 * @param params
	 * @return rs查询结果集
	 * 或采用executeQuery(String sql,Object[] params)方法
	 */
	public ResultSet executeQuery(String sql,List<Object> params){
		//获取连接
		if(getConnection()==null){
			return null;
		}
		try {
			//创建PreparedStatement对象
			pstmt = conn.prepareStatement(sql);
			//如果条件查询，需要给SQL语句进行参数绑定
			//如果没有查询条件，则直接运行rs = pstmt.executeQuery();
			if(params!=null && params.size()>0){
				//循环查询参数集合，因为不确定集合对象中每个字段带类型，因此采用pstmt.setObject()进行查询参数绑定
				for(int i=0;i<params.size();i++){
					pstmt.setObject(i+1, params.get(i));
				}
			}
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return rs;
	}
	/**
	 * 开启事务
	 */
	public void beginTx() {
		try {
			conn.setAutoCommit(false);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	/**
	 * 回滚
	 */
	public void rollback() {
		try {
			conn.rollback();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	/**
	 * 提交事务
	 */
	public void commit() {
		try {
			conn.commit();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	
	/**
	 * 数据库关闭连接
	 */
	public void closeConnection(){
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(pstmt!=null){
				pstmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

