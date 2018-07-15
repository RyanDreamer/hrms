package com.hrms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.hrms.dao.IJobDao;
import com.hrms.entity.Job;
import com.hrms.util.BaseDao;

public class JobDaoImpl implements IJobDao {
	
private BaseDao baseDao;
	
	/**
	 * ��ѯ����Ա����Ϣ
	 */

	@Override
	public List<Job> showJob() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<Job> list = new ArrayList<Job>();
		String sql = "select * from job";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer jid = rs.getInt("jid");
				String title = rs.getString("title");
				String dept = rs.getString("dept");
				Integer countDemand = rs.getInt("countDemand");
				Integer countReal = rs.getInt("countReal");
				Integer salary = rs.getInt("salary");
				
				Job emp = new Job(jid, title, dept, countDemand, countReal, salary);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Job> findJob(String col, Object param){
		baseDao = new BaseDao();
		List<Job> list = new ArrayList<Job>();
		String sql = "select * from job where "+col+"=?";
		List<Object> params = new ArrayList<Object>();
		params.add(param);
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer jid = rs.getInt("jid");
				String title = rs.getString("title");
				String dept = rs.getString("dept");
				Integer countDemand = rs.getInt("countDemand");
				Integer countReal = rs.getInt("countReal");
				Integer salary = rs.getInt("salary");
				
				Job emp = new Job(jid, title, dept, countDemand, countReal, salary);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public int addJob(int jid, String title, String dept, int countDemand, int countReal, int salary) {
		// TODO Auto-generated method stub
        baseDao = new BaseDao();
		
		//Ӱ������
		int result = 0;
		String sql = "insert into job values(?,?,?,?,?,?)";	
		
		//����baseDao�ĺ���ִ�в������
		//��executeUpdate(sql, params),Ҫ�ȰѴ����Ĳ���ת��List
		List<Object> list = new ArrayList<Object>();
		list.add(jid);
		list.add(title);
		list.add(dept);
		list.add(countDemand);
		list.add(countReal);
		list.add(salary);
		result = baseDao.executeUpdate(sql, list);
		
		//��ӡ�����Ϣ
		if (result != 0) {
			System.out.println("�ɹ����룬Ӱ����"+result+"�У���ϲ");
		}
		else {
			System.out.println("Sorry,ʧ����");
		}
		
		return result;
	}
	
	/* 
	 * ɾ������
	 */
	@Override
	public int rmJob(int jid) {
		baseDao = new BaseDao();
		// TODO Auto-generated method stub
		//Ӱ������
		int result = 0;
		//���û�ȷ��Ҫɾ��
		int x = 1;
		if (x != 1) {
			System.out.println("��ȡ������");
			return 0;
		}
		//��ʼɾ��
		String sql = "delete from job where jid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(jid);
		
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("�ɹ�ɾ��"+jid+"�Ÿ�λ����Ϣ");
		}
		else {
			System.out.println("û�ܳɹ�ɾ��");
		}
		
		return result;
	}
	
	/**
	 * ���²���
	 */
	@Override
	public int updateJob(int jid, String title, String dept, int countDemand, int countReal, int salary) {
		int result = 0;
		//��ɾ�ٲ���
		rmJob(jid);
		result = addJob(jid, title, dept, countDemand, countReal, salary );
		
		return result;
		
	}
	
	/**
	 * ��������
	 */
	@Override
	public int updateJob(int jid, String col, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//��Ӱ�������
		int result = 0;
		String sql = "update job set "+col+"=? where jid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//ȷ��Ҫ�޸ĵĸ�λ
		params.add(jid);
		//ִ��
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("�ɹ�����"+jid+"�Ÿ�λ����Ϣ");
		}
		else {
			System.out.println("û�ܳɹ�����");
		}
		return result;
	}

}
