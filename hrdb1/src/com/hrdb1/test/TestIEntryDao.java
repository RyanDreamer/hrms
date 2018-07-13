package com.hrdb1.test;

import java.sql.Date;
import java.util.List;

import org.junit.Test;

import com.hrdb1.dao.IEntryDao;
import com.hrdb1.dao.impl.EntryDaoImpl;
import com.hrdb1.entity.Entry;


public class TestIEntryDao {

	@Test
	public void testaddEntry() {
		IEntryDao emp = new EntryDaoImpl();
		emp.addEntry(1, Date.valueOf("2018-12-15"), 1, "入职部门");
		emp.addEntry(2, Date.valueOf("2014-11-15"), 2, "入职部门");
	}
	
	@Test
	public void testshowEntry() {
		IEntryDao emp = new EntryDaoImpl();
		List<Entry> list = emp.showEntry();
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getEid() + "	");
			System.out.print(list.get(i).getDate() + "	");
			System.out.print(list.get(i).getJid() + "	");
			System.out.println(list.get(i).getDept());
		}
	}

}
