package com.hrdb1.test;


import org.junit.Test;
import java.sql.Date;
import java.util.List;

import com.hrdb1.dao.IJobDao;
import com.hrdb1.dao.IPConDao;
import com.hrdb1.dao.impl.JobDaoImpl;
import com.hrdb1.dao.impl.PConDaoImpl;
import com.hrdb1.entity.Job;
import com.hrdb1.entity.PCon;

public class TestIPConDao {

	@Test
	public void testaddPCon() {
		IPConDao emp = new PConDaoImpl();
		emp.addPCon(1, 1234, Date.valueOf("2010-05-07"), Date.valueOf("2005-06-07"), 1, 1);
		emp.addPCon(2, 3324, Date.valueOf("2005-07-07"), Date.valueOf("2001-09-07"), 2, 2);
	}
	
	@Test
	public void testshowPCon() {
		IPConDao emp = new PConDaoImpl();
		List<PCon> list = emp.showPCon();
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getId() + "	");
			System.out.print(list.get(i).getSalary() + "	");
			System.out.print(list.get(i).getStartdate() + "	");
			System.out.print(list.get(i).getDeadline() + "	");
			System.out.print(list.get(i).getEid() + "	");
			System.out.println(list.get(i).getJid());
		}
	}
	
	@Test
	public void testfindPCon() {
		IPConDao emp = new PConDaoImpl();
		String col = "id";
		String param = "1";
		List<PCon> list = null;
		list=emp.findPCon(col, param);
		System.out.println("id"+"\t"+ "salary"+"\t"+"startDate  "+"\t"+"deadline   "+"\t"+"eid   "+"\t"+"jid   "+"\t");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getId() + "	");
			System.out.print(list.get(i).getSalary() + "		");
			System.out.print(list.get(i).getStartdate() + "	");
			System.out.print(list.get(i).getDeadline() + "		");
			System.out.print(list.get(i).getEid() + "		");
			System.out.println(list.get(i).getJid());
		}
	}
	
	@Test
	public void testrmPCon() {
		IPConDao emp = new PConDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.rmPCon(1);
		System.out.println("删除受影响行数:"+result);
	}
	
	@Test
	public void testupdatePCon() {
		IPConDao emp = new PConDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.updatePCon(1, 1111, Date.valueOf("2000-12-11"), Date.valueOf("2001-02-02"), 1, 1);
		System.out.println("修改受影响行数:"+result);
	}
	
	@Test
	public void testupdatePConP() {
		IPConDao emp = new PConDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.updatePCon(1, "startDate", "1998-01-04");
		System.out.println("修改受影响行数:"+result);
	}

	

}
