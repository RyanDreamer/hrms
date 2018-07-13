package com.hrdb1.test;

import java.sql.Date;
import java.util.List;

import org.junit.Test;

import com.hrdb1.dao.IPConDao;
import com.hrdb1.dao.IPTransDao;
import com.hrdb1.dao.impl.PConDaoImpl;
import com.hrdb1.dao.impl.PTransDaoImpl;
import com.hrdb1.entity.PCon;
import com.hrdb1.entity.PTrans;

public class TestIPTransDao {

	@Test
	public void testaddPTrans() {
		IPTransDao emp = new PTransDaoImpl();
		emp.addPTrans(1, 1, 2, "总部", "程序", Date.valueOf("2017-04-03"), "备注");
	    emp.addPTrans(2, 2, 1, "程序", "总部", Date.valueOf("2015-02-03"), "备注");
	}

	@Test
	public void testshowPTrans() {
		IPTransDao emp = new PTransDaoImpl();
		List<PTrans> list = emp.showPTrans();
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getEid() + "	");
			System.out.print(list.get(i).getPrejob() + "	");
			System.out.print(list.get(i).getNextjob() + "	");
			System.out.print(list.get(i).getPredept() + "	");
			System.out.print(list.get(i).getNextjob() + "	");
			System.out.print(list.get(i).getDate() + "	");
			System.out.println(list.get(i).getPS());
		}
	}
	
	@Test
	public void testfindPTrans() {
		IPTransDao emp = new PTransDaoImpl();
		String col = "eid";
		String param = "1";
		List<PTrans> list = null;
		list=emp.findPTrans(col, param);
		System.out.println("eid"+"\t"+ "preJob"+"\t"+"nextJob  "+"\t"+"preDept    "+"\t"+"nextDept    "+"\t"+"date   "+"\t"+"PS    "+"\t");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getEid() + "	");
			System.out.print(list.get(i).getPrejob() + "	");
			System.out.print(list.get(i).getNextjob() + "		");
			System.out.print(list.get(i).getPredept() + "	");
			System.out.print(list.get(i).getNextdept() + "		");
			System.out.print(list.get(i).getDate() + "		");
			System.out.println(list.get(i).getPS());
		}
	}
	
	@Test
	public void testrmPTrans() {
		IPTransDao emp = new PTransDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.rmPTrans(2);
		System.out.println("删除受影响行数:"+result);
	}
	
	@Test
	public void testupdatePTrans() {
		IPTransDao emp = new PTransDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.updatePTrans(2, 2, 1, "总部", "总部", Date.valueOf("2001-02-02"), "PS");
		System.out.println("修改受影响行数:"+result);
	}
	
	@Test
	public void testupdatePTransP() {
		IPTransDao emp = new PTransDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.updatePTrans(1, "date", "1998-01-04");
		System.out.println("修改受影响行数:"+result);
	}

}
