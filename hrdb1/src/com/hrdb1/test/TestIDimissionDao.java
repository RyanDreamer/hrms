package com.hrdb1.test;

import org.junit.Test;

import java.sql.Date;
import java.util.List;

import com.hrdb1.dao.IDeptDao;
import com.hrdb1.dao.IDimissionDao;
import com.hrdb1.dao.impl.DeptDaoImpl;
import com.hrdb1.dao.impl.DimissionDaoImpl;
import com.hrdb1.entity.Dept;
import com.hrdb1.entity.Dimission;


public class TestIDimissionDao {

	@Test
	public void testaddDimission() {
		IDimissionDao emp = new DimissionDaoImpl();
		emp.addDimission(1, Date.valueOf("2018-01-01"), 1, "原因");
		
		emp.addDimission(2, Date.valueOf("2018-01-01"), 2, "原因");
		emp.addDimission(3, Date.valueOf("2018-02-02"), 3, "原因");
		emp.addDimission(4, Date.valueOf("2018-03-03"), 4, "原因");
	}
	
	@Test
	public void testshowDimission() {
		IDimissionDao emp = new DimissionDaoImpl();
		List<Dimission> list = emp.showDimission();
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getEid() + "	");
			System.out.print(list.get(i).getJid() + "	");
			System.out.print(list.get(i).getReason() + "	");
			System.out.println(list.get(i).getDate());
		}
	}
	
	@Test
	public void testfindDimission() {
		IDimissionDao emp = new DimissionDaoImpl();
		String col = "eid";
		String param = "1";
		List<Dimission> list = null;
		list=emp.findDimission(col, param);
		System.out.println("eid"+"\t"+ "date"+"\t"+"jid"+"\t"+"reason"+"\t");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getEid() + "	");
			System.out.print(list.get(i).getDate() + "		");
			System.out.print(list.get(i).getJid() + "		");
			System.out.println(list.get(i).getReason());
		}
	}
	
	@Test
	public void testrmDimission() {
		IDimissionDao emp = new DimissionDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.rmDimission(4);
		System.out.println("删除受影响行数:"+result);
	}
	
	@Test
	public void testupdateDimission() {
		IDimissionDao emp = new DimissionDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.updateDimission(3, Date.valueOf("2013-03-03"), 3, "原因");
		System.out.println("修改受影响行数:"+result);
	}
	
	@Test
	public void testupdateDimissionP() {
		IDimissionDao emp = new DimissionDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.updateDimission(3, "date", "2012-02-02");
		System.out.println("修改受影响行数:"+result);
	}

}
