package com.hrms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.hrms.entity.EmployeeInfo;

/**
* ���������ݵ�һ���������ӡ��رա���ɾ�Ĳ�
* @author zhouy
*
*/


public class BaseDao {
	//����
	//getBundle��ȡ�����ļ���getString���ݼ�ȡ����
	private String driver = ResourceBundle.getBundle("hrms").getString("driver");
	private String username = ResourceBundle.getBundle("hrms").getString("username");
	private String url = ResourceBundle.getBundle("hrms").getString("url");
	private String password = ResourceBundle.getBundle("hrms").getString("password");
	
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement ps;
	
	
	/**
	 * ���ݿ�����
	 * @return
	 */
	public Connection getConnection() {
		try {
			Class.forName(driver);
			if (conn == null || conn.isClosed()) {//���ݿ�Ϊ�ջ�ر�������
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
	 * ͨ�ò�ѯ����
	 * @param sql
	 * @param params
	 * @return rs��ѯ�����
	 */
	public ResultSet executeQuery(String sql, List<Object> params) {
		//��ȡ����
		if (getConnection() == null) {
			return null;
		}
		
		try {
			//����prepareStatement����
			ps = conn.prepareStatement(sql);
			//���������ѯ����Ҫ��SQL�����в�����
			//���û��������ѯ����ֱ������rs = ps.executeQuery();
			if (params != null && params.size()>0) {
				//ѭ����ѯ�������ϣ���Ϊ��ȷ�����϶�����ÿ���ֶε����ͣ���˲���ps.setObject���в�ѯ������
				for (int i=0; i<params.size(); i++) {
					
					ps.setObject(i+1, params.get(i));//ps�Ĳ����Ǵӿ�ʼ��
				}
			}
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
		
	}
	
	
	/**
	 * ͨ����ɾ��
	 * @param sql
	 * @param params
	 * @return
	 */
	public int executeUpdate(String sql, List<Object> params) {
		int result = 0;
		//��ȡ����
		if (getConnection() == null) {
			return -1;
		}
		try {
			//����prepareStatement����
			ps = conn.prepareStatement(sql);
			//���������ѯ����Ҫ��SQL�����в�����
			//���û��������ѯ����ֱ������rs = ps.executeQuery();
			if (params != null && params.size()>0) {
				//ѭ����ѯ�������ϣ���Ϊ��ȷ�����϶�����ÿ���ֶε����ͣ���˲���ps.setObject���в�ѯ������
				for (int i=0; i<params.size(); i++) {
					ps.setObject(i+1, params.get(i));
				}
			}
			result = ps.executeUpdate();
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
			if(ps!=null){
				ps.close();
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
	
	
	/**
	 * ��������
	 */
	public void beginTran() {
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * �ع�
	 */
	public void rollback() {
		try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * �ύ����
	 */
	public void commit() {
		try {
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * ��������
	 * ���񲻿��ܳɹ�����ʱ����
	 * @param sql
	 * @param datas
	 * @return ��Ӱ�������
	 */
	public int executeUpdateAll(String sql, List<List<Object>> datas) {
		//Ӱ�������
		int result = 0;
		//��ȡ����
		if (getConnection() == null) {
			return -1;
		}
		try {
			//����prepareStatement����ִ��Ԥ����
			ps = conn.prepareStatement(sql);
			//���ò��Զ��ύ����ʼ���񣬷���ع�
			beginTran();
			//����ѭ��ȡ����
			for (int j=0; j<datas.size(); j++) {
				for (int i=0; i<datas.get(j).size(); i++) {
					ps.setObject(i+1, datas.get(j).get(i));
				}
				//�Ȱ����ݶ���һ�ԣ��Ȼ��û����һ���ύ
				ps.addBatch();
			}
			
			int[] arr = ps.executeBatch();
			commit();
			result = arr.length;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} finally{
			//�ر����ݿ�����
			this.closeConnection();
		}
		return result;
	}
	
}


	
