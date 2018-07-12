package com.hrms.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.hrms.dao.IEmployeeInfoDao;
import com.hrms.dao.impl.EmployeeInfoDaoImpl;
import com.hrms.entity.EmployeeInfo;

public class IEmployeeInfoDaoTest {

	@Test
	public void testShowEmployee() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		List<EmployeeInfo> list = emp.showEmployee();
		System.out.println("工号"+"\t"+ "姓名"+"\t"+"年龄"+"\t"+
						"性别"+"\t"+"籍贯"+"\t"+"上个职业"+"\t"+"工作年数"+"\t"+
						"学历"+"\t"+"英语四级"+"\t"+"家庭成员人数");
		for (int i=0; i<list.size(); i++) {
			list.get(i).outPut();
		}
		System.out.println("************");
		List<EmployeeInfo> list2 = emp.findEmployeeByAge(17);
		List<EmployeeInfo> list3 = emp.findEmployeeByName("Mary");
		for (int i=0; i<list2.size(); i++) {
			list2.get(i).outPut();
		}
		for (int i=0; i<list3.size(); i++) {
			list3.get(i).outPut();
		}
	}

	@Test
	public void testAddEmployee() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		int result = 0; //受影响的行数
		
		result = emp.addEmployee(5, "Mary", 18, "女", "NewYork", "UI", 3, "学士", "no", 1);
	}
	
	@Test
	public void testRmEmployee() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		int result = 0; //受影响的行数
		
		result = emp.rmEmployee(1);
	}
	
	@Test
	public void testUpdateEmployee() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		int result = 0; //受影响的行数
		
		emp.updateSex(2, "女");
		emp.updateExperience(2, 10);
		emp.updateEmployee(6, "Ryan", 17, "男"
				, "UK", "DJ", 3, "doctor", "yes", 1);
		System.out.println("成功操作");
	}

}
