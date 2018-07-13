package com.hrdb1.test;

import java.sql.Date;
import java.util.List;

import org.junit.Test;

import com.hrdb1.dao.IPTransDao;
import com.hrdb1.dao.impl.PTransDaoImpl;

import com.hrdb1.entity.PTrans;

public class TestIPTransDao {

	@Test
	public void testaddPTrans() {
		IPTransDao emp = new PTransDaoImpl();
		emp.addPTrans(1, 1, 2, "�ܲ�", "����", Date.valueOf("2017-04-03"), "��ע");
	    emp.addPTrans(2, 2, 1, "����", "�ܲ�", Date.valueOf("2015-02-03"), "��ע");
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
}
