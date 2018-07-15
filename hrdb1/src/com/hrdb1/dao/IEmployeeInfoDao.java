package com.hrdb1.dao;

import java.util.List;

import com.hrdb1.entity.EmployeeInfo;

public interface IEmployeeInfoDao {
	
	/**
	 * ��ѯ����Ա����Ϣ
	 * @param datas
	 * @return
	 */
	public List<EmployeeInfo> showEmployeeInfo();
	
	public List<EmployeeInfo> findEmployeeInfo(String col, String param);
	
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
	
	public int addEmployeeInfo(int eid, String name, int age, String sex, String hometowm, String oldjob, int experience,
			String education, String cet4, int family, String password);
	
	/**
	 * ����Ա����ɾ����������
	 * @param name
	 * @return ��Ӱ�������
	 */
	public int rmEmployeeInfo(int eid);
	
	/**
	 * ����Ա������Ϣ���ɷ����ģ�Ҳ��ȫ����
	 * @return ��Ӱ�������
	 */
	public int updateEmployeeInfo(int eid, String name, int age, String sex, String hometowm, String oldjob, int experience,
			String education, String cet4, int family, String password);
	
	public int updateEmployeeInfo(int eid, String col, String value);
}