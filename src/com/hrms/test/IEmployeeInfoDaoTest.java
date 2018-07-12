package com.hrms.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.hrms.dao.IEmployeeInfoDao;
import com.hrms.dao.impl.EmployeeInfoDaoImpl;
import com.hrms.entity.EmployeeInfo;

public class IEmployeeInfoDaoTest {

	@Test
	public void testShowEmployee() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		List<EmployeeInfo> list = emp.showEmployee();
		System.out.println("����"+"\t"+ "����"+"\t"+"����"+"\t"+
						"�Ա�"+"\t"+"����"+"\t"+"�ϸ�ְҵ"+"\t"+"��������"+"\t"+
						"ѧ��"+"\t"+"Ӣ���ļ�"+"\t"+"��ͥ��Ա����");
		for (int i=0; i<list.size(); i++) {
			list.get(i).outPut();
		}
	}

	@Test
	public void testAddEmployee() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		int result = 0; //��Ӱ�������
		
		result = emp.addEmployee(4, "Richiel", 18, "��", "LS", "Music", 3, "ѧʿ", "no", 1);
	}

}
