package com.hrms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.hrms.dao.IPConDao;
import com.hrms.entity.PCon;
import com.hrms.util.BaseDao;

public class PConDaoImpl implements IPConDao {
	
private BaseDao baseDao;
	
	/**
	 * ��ѯ����Ա����Ϣ
	 */

	@Override
	public List<PCon> showPCon() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<PCon> list = new ArrayList<PCon>();
		String sql = "select * from PCon";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer id = rs.getInt("id");
				Integer salary = rs.getInt("salary");
				String startdate = rs.getString("startdate");
				String deadline = rs.getString("deadline");
				Integer eid = rs.getInt("eid");
				Integer jid = rs.getInt("jid");
				
				PCon emp = new PCon(id, salary, startdate, deadline, eid, jid);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<PCon> findPCon(String col, String param){
		baseDao = new BaseDao();
		List<PCon> list = new ArrayList<PCon>();
		String sql = "select * from pcon where "+col+"=?";
		List<Object> params = new ArrayList<Object>();
		params.add(param);
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer id = rs.getInt("id");
				Integer salary  = rs.getInt("salary");
				String startDate = rs.getString("startDate");
				String deadline = rs.getString("deadline");
				Integer eid  = rs.getInt("eid");
				Integer jid  = rs.getInt("jid");
				
				PCon emp = new PCon(id, salary, startDate, deadline, eid, jid);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int addPCon(int id, int salary, String startdate, String deadline, int eid, int jid) {
		// TODO Auto-generated method stub
        baseDao = new BaseDao();
		
		//Ӱ������
		int result = 0;
		String sql = "insert into PCon values(?,?,?,?,?,?)";	
		
		//����baseDao�ĺ���ִ�в������
		//��executeUpdate(sql, params),Ҫ�ȰѴ����Ĳ���ת��List
		List<Object> list = new ArrayList<Object>();
		list.add(id);
		list.add(salary);
		list.add(startdate);
		list.add(deadline);
		list.add(eid);
		list.add(jid);
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
	public int rmPCon(int id) {
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
		String sql = "delete from pcon where id=?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("�ɹ�ɾ��"+id+"�ź�ͬ����Ϣ");
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
	public int updatePCon(int id, int salary, String startdate, String deadline, int eid, int jid) {
		int result = 0;
		//��ɾ�ٲ���
		rmPCon(id);
		result = addPCon(id, salary, startdate, deadline, eid, jid );
		
		return result;
		
	}
	
	/**
	 * ��������
	 */
	@Override
	public int updatePCon(int id, String col, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//��Ӱ�������
		int result = 0;
		String sql = "update pcon set "+col+"=? where id=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//ȷ��Ҫ�޸ĵĸ�λ
		params.add(id);
		//ִ��
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("�ɹ�����"+id+"�ź�ͬ����Ϣ");
		}
		else {
			System.out.println("û�ܳɹ�����");
		}
		return result;
	}


}
