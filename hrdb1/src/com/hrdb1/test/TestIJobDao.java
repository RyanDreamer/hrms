package com.hrdb1.test;

import java.util.List;

import org.junit.Test;


import com.hrdb1.dao.IJobDao;

import com.hrdb1.dao.impl.JobDaoImpl;

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

}
