package com.hrdb1.test;

import org.junit.Test;
import com.hrdb1.util.BaseDao;

public class BaseDaoTest {
	
	private BaseDao baseDao;

	@Test
	public void testGetConnection() {
		baseDao = new BaseDao();
		if(baseDao.getConnection()==null){
			System.out.println("数据库没有连接");
		}else{
			System.out.println("数据库已经连接");
		}
	}

}
