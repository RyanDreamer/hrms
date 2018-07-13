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
		emp.addDept("�ܲ�", 0, "�ܲ�");
		emp.addDept("���", 1, "�ܲ�");
		emp.addDept("����", 2, "�ܲ�");
		emp.addDept("Java", 3, "�ܲ�");
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
		String param = "�ܲ�";
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
		int result = 0; //��Ӱ�������	
		result = emp.rmDept("����");
		System.out.println("ɾ����Ӱ������:"+result);
	}
	
	@Test
	public void testupdateDept() {
		IDeptDao emp = new DeptDaoImpl();
		int result = 0; //��Ӱ�������	
		result = emp.updateDept("���", 2, "�ܲ�");
		System.out.println("�޸���Ӱ������:"+result);
	}
	
	@Test
	public void testupdateDeptP() {
		IDeptDao emp = new DeptDaoImpl();
		int result = 0; //��Ӱ�������	
		result = emp.updateDept("���", "minister","1");
		System.out.println("�޸���Ӱ������:"+result);
	}
	
}
