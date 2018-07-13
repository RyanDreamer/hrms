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
	public List<EmployeeInfo> findEmployee(String col, Object param);
	
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
	 * @param password
	 * @return
	 */
	public int addEmployee(int eid, String name, int age, String sex, String hometown, String oldJob, int experience, String education, String cet4,int family, String password );
	
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
	public int updateEmployee(int eid, String name, int age, String sex, String hometown, String oldJob, int experience, String education, String cet4, int family, String password);
	public int updateEmployee(int eid, String col, String value);
}
