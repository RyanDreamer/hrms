package com.hrdb1.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hrdb1.dao.IEmployeeInfoDao;
import com.hrdb1.entity.EmployeeInfo;
import com.hrdb1.util.BaseDao;

public class EmployeeInfoDaoImpl implements IEmployeeInfoDao {
	private BaseDao baseDao;
	
	/**
	 * ��ѯ����Ա����Ϣ
	 */
	@Override
	public List<EmployeeInfo> showEmployeeInfo() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from employeeInfo";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				String name = rs.getString("name");
				Integer age = rs.getInt("age");
				String sex = rs.getString("sex");
				String hometown = rs.getString("hometown");
				String oldJob = rs.getString("oldJob");
				Integer experience = rs.getInt("experience");
				String education = rs.getString("education");
				String cet4 = rs.getString("cet4");
				Integer family = rs.getInt("family");
				
				EmployeeInfo emp = new EmployeeInfo(eid, name, age, sex, hometown, oldJob, experience, education, cet4, family);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.hrms.dao.IEmployeeInfoDao#addEmployee(java.util.List)
	 */
	@Override
	public int addEmployeeInfo(int eid, String name, int age, String sex, String hometown, String oldJob, int experience, String education, String cet4, int family ) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		
		//Ӱ������
		int result = 0;
		String sql = "insert into employeeInfo values(?,?,?,?,?,?,?,?,?,?)";	
		
		//����baseDao�ĺ���ִ�в������
		//��executeUpdate(sql, params),Ҫ�ȰѴ����Ĳ���ת��List
		List<Object> list = new ArrayList<Object>();
		list.add(eid);
		list.add(name);
		list.add(age);
		list.add(sex);
		list.add(hometown);
		list.add(oldJob);
		list.add(experience);
		list.add(education);
		list.add(cet4);
		list.add(family);
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