package com.hrdb1.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.hrdb1.dao.IPTransDao;
import com.hrdb1.entity.PTrans;
import com.hrdb1.util.BaseDao;

public class PTransDaoImpl implements IPTransDao {
	
private BaseDao baseDao;
	
	/**
	 * ��ѯ����Ա����Ϣ
	 */

	@Override
	public List<PTrans> showPTrans() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<PTrans> list = new ArrayList<PTrans>();
		String sql = "select * from PTrans";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				Integer prejob = rs.getInt("prejob");
				Integer nextjob = rs.getInt("nextjob");
				String predept = rs.getString("predept");
				String nextdept = rs.getString("nextdept");
				String date = rs.getString("date");
				String pS = rs.getString("pS");
				
				PTrans emp = new PTrans(eid, prejob, nextjob, predept, nextdept, date, pS);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<PTrans> findPTrans(String col, String param){
		baseDao = new BaseDao();
		List<PTrans> list = new ArrayList<PTrans>();
		String sql = "select * from ptrans where "+col+"=?";
		List<Object> params = new ArrayList<Object>();
		params.add(param);
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				Integer preJob = rs.getInt("preJob");
				Integer nextJob  = rs.getInt("nextJob");
				String preDept = rs.getString("preDept");
				String nextDept = rs.getString("nextDept");
				String date = rs.getString("date");
				String PS  = rs.getString("PS");
				
				PTrans emp = new PTrans(eid, preJob, nextJob, preDept, nextDept, date, PS);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public int addPTrans(int eid, int prejob, int nextjob, String predept, String nextdept, String date, String pS) {
		// TODO Auto-generated method stub
        baseDao = new BaseDao();
		
		//Ӱ������
		int result = 0;
		String sql = "insert into PTrans values(?,?,?,?,?,?,?)";	
		
		//����baseDao�ĺ���ִ�в������
		//��executeUpdate(sql, params),Ҫ�ȰѴ����Ĳ���ת��List
		List<Object> list = new ArrayList<Object>();
		list.add(eid);
		list.add(prejob);
		list.add(nextjob);
		list.add(predept);
		list.add(nextdept);
		list.add(date);
		list.add(pS);
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
	public int rmPTrans(int eid) {
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
		String sql = "delete from ptrans where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(eid);
		
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("�ɹ�ɾ��"+eid+"�ź�ͬ����Ϣ");
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
	public int updatePTrans(int eid, int prejob, int nextjob, String predept, String nextdept, String date, String pS) {
		int result = 0;
		//��ɾ�ٲ���
		rmPTrans(eid);
		result = addPTrans(eid, prejob, nextjob, predept, nextdept, date,  pS);
		
		return result;
		
	}
	
	/**
	 * ��������
	 */
	@Override
	public int updatePTrans(int eid, String col, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//��Ӱ�������
		int result = 0;
		String sql = "update ptrans set "+col+"=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//ȷ��Ҫ�޸ĵĵ�����Ϣ
		params.add(eid);
		//ִ��
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("�ɹ�����"+eid+"�ŵ�������Ϣ");
		}
		else {
			System.out.println("û�ܳɹ�����");
		}
		return result;
	}

}
