package com.hrdb1.test;

import org.junit.Test;
import com.hrdb1.util.BaseDao;

public class BaseDaoTest {
	
	private BaseDao baseDao;

	@Test
	public void testGetConnection() {
		baseDao = new BaseDao();
		if(baseDao.getConnection()==null){
			System.out.println("���ݿ�û������");
		}else{
			System.out.println("���ݿ��Ѿ�����");
		}
	}

}
