package com.hrdb1.dao.impl;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.hrdb1.dao.IDimissionDao;
import com.hrdb1.entity.Dimission;
import com.hrdb1.util.BaseDao;

public class DimissionDaoImpl implements IDimissionDao {
	
    private BaseDao baseDao;
	
	/**
	 * ��ѯ����Ա����Ϣ
	 */

	@Override
	public List<Dimission> showDimission() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<Dimission> list = new ArrayList<Dimission>();
		String sql = "select * from dimission";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				String date = rs.getString("date");
				Integer jid = rs.getInt("jid");
				String reason = rs.getString("reason");
				
				Dimission emp = new Dimission(eid, date, jid, reason);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Dimission> findDimission(String col, String param){
		baseDao = new BaseDao();
		List<Dimission> list = new ArrayList<Dimission>();
		String sql = "select * from dimission where "+col+"=?";
		List<Object> params = new ArrayList<Object>();
		params.add(param);
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				String date = rs.getString("date");
				Integer jid = rs.getInt("jid");
				String reason = rs.getString("reason");
				
				Dimission emp = new Dimission(eid, date, jid, reason);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public int addDimission(int eid, String date, int jid, String reason) {
		// TODO Auto-generated method stub
        baseDao = new BaseDao();
		
		//Ӱ������
		int result = 0;
		String sql = "insert into dimission values(?,?,?,?)";	
		
		//����baseDao�ĺ���ִ�в������
		//��executeUpdate(sql, params),Ҫ�ȰѴ����Ĳ���ת��List
		List<Object> list = new ArrayList<Object>();
		list.add(eid);
		list.add(date);
		list.add(jid);
		list.add(reason);
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
	public int rmDimission(int eid) {
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
		String sql = "delete from dimission where eid=?";
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
	public int updateDimission(int eid,String date, int jid, String reason) {
		int result = 0;
		//��ɾ�ٲ���
		rmDimission(eid);
		result = addDimission(eid, date, jid, reason);	
		return result;
		
	}
	
	/**
	 * ��������
	 */
	@Override
	public int updateDimission(int eid, String col, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//��Ӱ�������
		int result = 0;
		String sql = "update dimission set "+col+"=? where eid=?";
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
