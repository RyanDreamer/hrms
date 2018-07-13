package com.hrdb1.test;

import java.sql.Date;
import java.util.List;

import org.junit.Test;

import com.hrdb1.dao.IEntryDao;
import com.hrdb1.dao.IJobDao;
import com.hrdb1.dao.impl.EntryDaoImpl;
import com.hrdb1.dao.impl.JobDaoImpl;
import com.hrdb1.entity.Entry;
import com.hrdb1.entity.Job;

public class TestIJobDao {

	@Test
	public void testaddJob() {
		IJobDao emp = new JobDaoImpl();
		emp.addJob(1, "职业名称", "总部", 22, 11, 1234);
		emp.addJob(2, "职业名称", "程序", 42, 51, 2334);
	}
	
	@Test public void testshowJob() {
		IJobDao emp = new JobDaoImpl();
		List<Job> list = emp.showJob();
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getJid() + "	");
			System.out.print(list.get(i).getTitle() + "	");
			System.out.print(list.get(i).getDept() + "	");
			System.out.print(list.get(i).getCountDemand() + "	");
			System.out.print(list.get(i).getCountReal() + "	");
			
			System.out.println(list.get(i).getSalary());
		}
	}
	
	@Test
	public void testfindJob() {
		IJobDao emp = new JobDaoImpl();
		String col = "jid";
		String param = "1";
		List<Job> list = null;
		list=emp.findJob(col, param);
		System.out.println("eid"+"\t"+ "title"+"\t"+"dept "+"\t"+"countDemand  "+"\t"+"countReal  "+"\t"+"salary  "+"\t");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getJid() + "	");
			System.out.print(list.get(i).getTitle() + "		");
			System.out.print(list.get(i).getDept() + "	");
			System.out.print(list.get(i).getCountDemand() + "		");
			System.out.print(list.get(i).getCountReal() + "		");
			System.out.println(list.get(i).getSalary());
		}
	}
	
	@Test
	public void testrmJob() {
		IJobDao emp = new JobDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.rmJob(1);
		System.out.println("删除受影响行数:"+result);
	}
	
	@Test
	public void testupdateJob() {
		IJobDao emp = new JobDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.updateJob(1,"职业名称", "总部", 11, 22, 2222);
		System.out.println("修改受影响行数:"+result);
	}
	
	@Test
	public void testupdateJobP() {
		IJobDao emp = new JobDaoImpl();
		int result = 0; //受影响的行数	
		result = emp.updateJob(1, "salary", "1111");
		System.out.println("修改受影响行数:"+result);
	}

}
