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
	public List<EmployeeInfo> findEmployee(String col, Object param);
	
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
	 * @param password
	 * @return
	 */
	public int addEmployee(int eid, String name, int age, String sex, String hometown, String oldJob, int experience, String education, String cet4,int family, String password );
	
	/**
	 * ����Ա����ɾ��Ա������
	 * @param eid
	 * @return ��Ӱ�������
	 */
	public int rmEmployee(int eid);
	
	/**
	 * ����Ա������Ϣ���ɷ����ģ�Ҳ��ȫ����
	 * @return ��Ӱ�������
	 */
	public int updateEmployee(int eid, String name, int age, String sex, String hometown, String oldJob, int experience, String education, String cet4, int family, String password);
	public int updateEmployee(int eid, String col, String value);
}
