package com.hrdb1.test;

import java.util.List;

import org.junit.Test;

import com.hrdb1.dao.IDeptDao;
import com.hrdb1.dao.impl.DeptDaoImpl;
import com.hrdb1.entity.Dept;

public class TestIDeptDao {
	
	@Test
	public void testaddDept()
	{
		IDeptDao emp = new DeptDaoImpl();
		emp.addDept("总部", 0, "总部");
		emp.addDept("设计", 1, "总部");
		emp.addDept("程序", 2, "总部");
		emp.addDept("Java", 3, "总部");
	}


	@Test
	public void testshowDept() {
		IDeptDao emp = new DeptDaoImpl();
		List<Dept> list = emp.showDept();
		System.out.println("name"+"\t"+ "minister"+"\t"+"sdept"+"\t");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getName() + "	");
			System.out.print(list.get(i).getMinister() + "		");
			System.out.println(list.get(i).getSdept());
		}
	}
	
	@Test
	public void testfindDept() {
		IDeptDao emp = new DeptDaoImpl();
		String col = "name";
		String param = "总部";
		List<Dept> list = null;
		list=emp.findDept(col, param);
		System.out.println("name"+"\t"+ "minister"+"\t"+"sdept"+"\t");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getName() + "	");
			System.out.print(list.get(i).getMinister() + "		");
			System.out.println(list.get(i).getSdept());
		}
	}
	
	@Test
	public void testrmDept() {
		IDeptDao emp = new DeptDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.rmDept("程序");
		System.out.println("删除受影响行数:"+result);
	}
	
	@Test
	public void testupdateDept() {
		IDeptDao emp = new DeptDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.updateDept("设计", 2, "总部");
		System.out.println("修改受影响行数:"+result);
	}
	
	@Test
	public void testupdateDeptP() {
		IDeptDao emp = new DeptDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.updateDept("设计", "minister","1");
		System.out.println("修改受影响行数:"+result);
	}
	
}
