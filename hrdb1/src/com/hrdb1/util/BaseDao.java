package com.hrdb1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

/**
 * ���������ݵ�һ���������ӡ��رա�����ɾ���ġ���
 * @author cher
 *
 */
public class BaseDao {
	
	//����
	private String driver = ResourceBundle.getBundle("jdbc").getString("driver");
	private String url = ResourceBundle.getBundle("jdbc").getString("url");
	private String username = ResourceBundle.getBundle("jdbc").getString("username");
	private String password = ResourceBundle.getBundle("jdbc").getString("password");
	
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement pstmt;
	
	/**
	 * ���ݿ�����
	 * @return
	 */
	public Connection getConnection(){
		try {
			//�������ݿ�����
			Class.forName(driver);
			if(conn == null || conn.isClosed()){
				//��DriverManager�������ݿ�����
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
	 * ͨ�� �� ɾ ��
	 * @param sql
	 * @param params
	 * @return resultӰ�������
	 * �����executeUpdate(String sql,Object[] params)����
	 */
	public int executeUpdate(String sql,List<Object> params){
		int result = 0;
		//��ȡ����
		if(getConnection()==null){
			return -1;
		}
		try {
			//����PreparedStatement����
			pstmt = conn.prepareStatement(sql);
			//�������ɾ���ģ���Ҫ��SQL�����в�����
			if(params!=null && params.size()>0){
				//ѭ����ѯ�������ϣ���Ϊ��ȷ�����϶�����ÿ���ֶδ����ͣ���˲���pstmt.setObject()���в�ѯ������
				for(int i=0;i<params.size();i++){
					pstmt.setObject(i+1, params.get(i));
				}
			}
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			//�ر����ݿ�����
			this.closeConnection();
		}
		return result;
	}
	/**
     * ִ�����ݿ�������
     *
     * @param datas  keyΪ������valueΪ�ж�Ӧ��ֵ��Map�����List����
     * @param sql 
     * @return Ӱ�������
     * @throws SQLException SQL�쳣
     */
    public int executeUpdateAll(String sql, List<List< Object>> datas) {
        //Ӱ�������
        int affectRowCount = 0;
        //��ȡ����
      	if(getConnection()==null){
      		return -1;
      	}
        try {
           
            //ִ��SQLԤ����
            pstmt = conn.prepareStatement(sql);
            //���ò��Զ��ύ���Ա����ڳ����쳣��ʱ�����ݿ�ع�
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
            System.out.println("�ɹ��˲�����" + affectRowCount + "��");
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
        		//�ر����ݿ�����
			this.closeConnection();
        }
        return affectRowCount;
    }
	
	/**
	 * ͨ�ò�ѯ����
	 * @param sql
	 * @param params
	 * @return rs��ѯ�����
	 * �����executeQuery(String sql,Object[] params)����
	 */
	public ResultSet executeQuery(String sql,List<Object> params){
		//��ȡ����
		if(getConnection()==null){
			return null;
		}
		try {
			//����PreparedStatement����
			pstmt = conn.prepareStatement(sql);
			//���������ѯ����Ҫ��SQL�����в�����
			//���û�в�ѯ��������ֱ������rs = pstmt.executeQuery();
			if(params!=null && params.size()>0){
				//ѭ����ѯ�������ϣ���Ϊ��ȷ�����϶�����ÿ���ֶδ����ͣ���˲���pstmt.setObject()���в�ѯ������
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
	 * ��������
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
	 * �ع�
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
	 * �ύ����
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
	 * ���ݿ�ر�����
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

