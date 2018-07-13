package com.hrdb1.test;


import org.junit.Test;
import java.sql.Date;
import java.util.List;

import com.hrdb1.dao.IPConDao;
import com.hrdb1.dao.impl.PConDaoImpl;

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
	

}
