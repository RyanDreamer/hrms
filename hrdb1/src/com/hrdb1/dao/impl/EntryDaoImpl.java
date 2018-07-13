package com.hrdb1.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import com.hrdb1.dao.IEntryDao;
import com.hrdb1.entity.Dimission;
import com.hrdb1.entity.Entry;
import com.hrdb1.util.BaseDao;

public class EntryDaoImpl implements IEntryDao {
	
    private BaseDao baseDao;
	
	/**
	 * ��ѯ����Ա����Ϣ
	 */

	@Override
	public List<Entry> showEntry() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<Entry> list = new ArrayList<Entry>();
		String sql = "select * from entry";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				Date date = rs.getDate("date");
				Integer jid = rs.getInt("jid");
				String dept = rs.getString("dept");
				
				Entry emp = new Entry(eid, date, jid, dept);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Entry> findEntry(String col, Object param){
		baseDao = new BaseDao();
		List<Entry> list = new ArrayList<Entry>();
		String sql = "select * from entry where "+col+"=?";
		List<Object> params = new ArrayList<Object>();
		params.add(param);
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				Date date = rs.getDate("date");
				Integer jid = rs.getInt("jid");
				String dept = rs.getString("dept");
				
				Entry emp = new Entry(eid, date, jid, dept);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int addEntry(int eid, Date date, int jid, String dept) {
		// TODO Auto-generated method stub
        baseDao = new BaseDao();
		
		//Ӱ������
		int result = 0;
		String sql = "insert into entry values(?,?,?,?)";	
		
		//����baseDao�ĺ���ִ�в������
		//��executeUpdate(sql, params),Ҫ�ȰѴ����Ĳ���ת��List
		List<Object> list = new ArrayList<Object>();
		list.add(eid);
		list.add(date);
		list.add(jid);
		list.add(dept);
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
	public int rmEntry(int eid) {
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
		String sql = "delete from entry where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(eid);
		
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("�ɹ�ɾ��"+eid+"����ְ����Ϣ");
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
	public int updateEntry(int eid,Date date, int jid, String dept) {
		int result = 0;
		//��ɾ�ٲ���
		rmEntry(eid);
		result = addEntry(eid, date, jid, dept);	
		return result;
		
	}
	
	/**
	 * ��������
	 */
	@Override
	public int updateEntry(int eid, String col, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//��Ӱ�������
		int result = 0;
		String sql = "update entry set "+col+"=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//ȷ��Ҫ�޸ĵĲ�����
		params.add(eid);
		//ִ��
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("�ɹ�����"+eid+"����ְ����Ϣ");
		}
		else {
			System.out.println("û�ܳɹ�����");
		}
		return result;
	}

}
