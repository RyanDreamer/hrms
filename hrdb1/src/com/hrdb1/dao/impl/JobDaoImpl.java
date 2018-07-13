package com.hrdb1.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import com.hrdb1.dao.IJobDao;
import com.hrdb1.entity.Job;
import com.hrdb1.util.BaseDao;

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

}
