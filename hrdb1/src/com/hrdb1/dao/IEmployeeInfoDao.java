package com.hrdb1.dao;

import java.util.List;

import com.hrdb1.entity.Dept;
import com.hrdb1.entity.EmployeeInfo;

public interface IEmployeeInfoDao {
	
	/**
	 * 查询所有员工信息
	 * @param datas
	 * @return
	 */
	public List<EmployeeInfo> showEmployeeInfo();
	
	public List<EmployeeInfo> findEmployeeInfo(String col, Object param);
	
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
	
	/**
	 * 根据员工号删除部门数据
	 * @param name
	 * @return 受影响的行数
	 */
	public int rmEmployeeInfo(int eid);
	
	/**
	 * 更新员工的信息，可分条改，也可全部改
	 * @return 受影响的行数
	 */
	public int updateEmployeeInfo(int eid, String name, int age, String sex, String hometowm, String oldjob, int experience,
			String education, String cet4, int family);
	public int updateEmployeeInfo(int eid, String col, String value);
}