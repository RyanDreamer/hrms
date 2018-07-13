package com.hrdb1.dao;

import java.util.List;

import com.hrdb1.entity.EmployeeInfo;

public interface IEmployeeInfoDao {
	
	/**
	 * 查询所有员工信息
	 * @param datas
	 * @return
	 */
	public List<EmployeeInfo> showEmployeeInfo();
	
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
	
	public int addEmployeeInfo(int eid, String name, int age, String sex, String hometowm, String oldjob, int experience,
			String education, String cet4, int family );
}