package com.hrdb1.test;

import org.junit.Test;

import java.sql.Date;
import java.util.List;

import com.hrdb1.dao.IDimissionDao;
import com.hrdb1.dao.impl.DimissionDaoImpl;
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
	

}
