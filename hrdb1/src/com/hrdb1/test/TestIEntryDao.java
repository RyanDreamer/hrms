package com.hrdb1.test;

import java.util.List;
import org.junit.Test;
import com.hrdb1.dao.IEntryDao;
import com.hrdb1.dao.impl.EntryDaoImpl;
import com.hrdb1.entity.Entry;

public class TestIEntryDao {

	@Test
	public void testaddEntry() {
		IEntryDao emp = new EntryDaoImpl();
		emp.addEntry(1, "2018-12-15", 1, "入职部门");
		emp.addEntry(2, "2014-11-15", 2, "入职部门");
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
	
	@Test
	public void testfindEntry() {
		IEntryDao emp = new EntryDaoImpl();
		String col = "eid";
		String param = "1";
		List<Entry> list = null;
		list=emp.findEntry(col, param);
		System.out.println("eid"+"\t"+ "date"+"\t"+"jid"+"\t"+"dept  "+"\t");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getEid() + "	");
			System.out.print(list.get(i).getDate() + "		");
			System.out.print(list.get(i).getJid() + "		");
			System.out.println(list.get(i).getDept());
		}
	}
	
	@Test
	public void testrmEntry() {
		IEntryDao emp = new EntryDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.rmEntry(2);
		System.out.println("删除受影响行数:"+result);
	}
	
	@Test
	public void testupdateEntry() {
		IEntryDao emp = new EntryDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.updateEntry(2,"2000-01-01", 2, "入职部门");
		System.out.println("修改受影响行数:"+result);
	}
	
	@Test
	public void testupdateEntryP() {
		IEntryDao emp = new EntryDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.updateEntry(2, "date", "1999-01-01");
		System.out.println("修改受影响行数:"+result);
	}

}
