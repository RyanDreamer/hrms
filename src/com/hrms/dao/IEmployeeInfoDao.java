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
	
	public List<EmployeeInfo> findEmployeeByEid(int eidv);
	public List<EmployeeInfo> findEmployeeByName(String namev);
	public List<EmployeeInfo> findEmployeeByAge(int agev);
	public List<EmployeeInfo> findEmployeeBySex(String sexv);
	public List<EmployeeInfo> findEmployeeByHometown(String hometownv);
	public List<EmployeeInfo> findEmployeeByOldJob(String oldJobv);
	public List<EmployeeInfo> findEmployeeByExperience(int experiencev);
	public List<EmployeeInfo> findEmployeeByEducation(String educationv);
	public List<EmployeeInfo> findEmployeeByCet4(String cet4v);
	public List<EmployeeInfo> findEmployeeByFamily(String familyv);
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
	public int updateEmployee(int eid, String name, int age, String sex, String hometown, String oldJob, int experience, String education, String cet4, int family);
	public int updateName(int eid, String value);
	public int updateAge(int eid, Integer value);
	public int updateSex(int eid, String value);
	public int updateHometown(int eid, String value);
	public int updateOldJob(int eid, String value);
	public int updateExperience(int eid, Integer value);
	public int updateEducation(int eid, String value);
	public int updateCet4(int eid, String value);
	public int updateFamily(int eid, Integer value);
}
