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
	
	
}
