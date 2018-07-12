package com.hrms.dao;

import java.util.List;

import com.hrms.entity.EmployeeInfo;

public interface IEmployeeInfoDao {
	
	/**
	 * ��ѯ����Ա����Ϣ
	 * @param datas
	 * @return
	 */
	public List<EmployeeInfo> showEmployee();
	
	/**
	 * ����һ��Ա����Ϣ
	 * @param eid
	 * @param name
	 * @param age
	 * @param sex
	 * @param hometown
	 * @param oldJob
	 * @param experience
	 * @param education
	 * @param cet4
	 * @param family
	 * @return
	 */
	public int addEmployee(int eid, String name, int age, String sex, String hometown, String oldJob, int experience, String education, String cet4,int family );
}
