package com.hrms.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hrms.util.BaseDao;

public class BaseDaoTest {

	@Test
	public void testGetConnection() {
		BaseDao baseDao = new BaseDao();
		if (baseDao.getConnection() == null) {
			System.out.println("����ʧ��");
		}
		else {
			System.out.println("���ݿ�������");
		}
	}

	@Test
	public void testExecuteQuery() {
		fail("Not yet implemented");
	}

	@Test
	public void testExecuteUpdate() {
		fail("Not yet implemented");
	}

}
