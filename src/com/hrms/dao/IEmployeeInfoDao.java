package com.hrms.dao;

import java.util.List;

import com.hrms.entity.EmployeeInfo;

public interface IEmployeeInfoDao {
	
	/**
	 * 查询所有员工信息
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
	 * 插入一条员工信息
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
	 * 根据员工号删除员工数据
	 * @param eid
	 * @return 受影响的行数
	 */
	public int rmEmployee(int eid);
	
	/**
	 * 更新员工的信息，可分条改，也可全部改
	 * @return 受影响的行数
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
