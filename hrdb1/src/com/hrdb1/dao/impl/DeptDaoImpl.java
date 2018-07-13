package com.hrdb1.dao.impl;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.hrdb1.dao.IDeptDao;
import com.hrdb1.entity.Dept;
import com.hrdb1.util.BaseDao;

public class DeptDaoImpl implements IDeptDao {
	private BaseDao baseDao;
	
	/**
	 * ��ѯ����Ա����Ϣ
	 */

	@Override
	public List<Dept> showDept() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<Dept> list = new ArrayList<Dept>();
		String sql = "select * from dept";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				String name = rs.getString("name");
				Integer minister = rs.getInt("minister");
				String sdept = rs.getString("sdept");
				
				Dept emp = new Dept(name, minister, sdept);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Dept> findEmployee(String col, Object param){
		baseDao = new BaseDao();
		List<Dept> list = new ArrayList<Dept>();
		String sql = "select * from dept where "+col+"=?";
		List<Object> params = new ArrayList<Object>();
		params.add(param);
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				String name = rs.getString("name");
				Integer minister = rs.getInt("minister");
				String sdept = rs.getString("sdept");
				
				Dept emp = new Dept(name, minister, sdept);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public int addDept(String name, int minister, String sdept) {
		// TODO Auto-generated method stub
        baseDao = new BaseDao();
		
		//Ӱ������
		int result = 0;
		String sql = "insert into dept values(?,?,?)";	
		
		//����baseDao�ĺ���ִ�в������
		//��executeUpdate(sql, params),Ҫ�ȰѴ����Ĳ���ת��List
		List<Object> list = new ArrayList<Object>();
		list.add(name);
		list.add(minister);
		list.add(sdept);
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
	
	/* (non-Javadoc)ɾ������
	 * @see com.hrms.dao.IDeptDao#rmDept(int)
	 */
	@Override
	public int rmDept(String name) {
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
		String sql = "delete from dept where name=?";
		List<Object> params = new ArrayList<Object>();
		params.add(name);
		
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("�ɹ�ɾ��"+name+"�Ų��ŵ���Ϣ");
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
	public int updateDept(String name, int minister, String sdept) {
		int result = 0;
		//��ɾ�ٲ���
		rmDept(name);
		result = addDept(name, minister, sdept );
		
		return result;
		
	}
	
	/**
	 * ��������
	 */
	@Override
	public int updateDept(String name, String col, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//��Ӱ�������
		int result = 0;
		String sql = "update dept set "+col+"=? where name=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//ȷ��Ҫ�޸ĵ�Ա����
		params.add(name);
		//ִ��
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("�ɹ�����"+name+"�Ų��ŵ���Ϣ");
		}
		else {
			System.out.println("û�ܳɹ�����");
		}
		return result;
	}

}
