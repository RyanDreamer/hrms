package com.hrms.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hrms.util.BaseDao;

public class BaseDaoTest {

	@Test
	public void testGetConnection() {
		BaseDao baseDao = new BaseDao();
		if (baseDao.getConnection() == null) {
			System.out.println("连接失败");
		}
		else {
			System.out.println("数据库已连接");
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
