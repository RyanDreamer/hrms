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
						"ѧ��"+"\t"+"Ӣ���ļ�"+"\t"+"��ͥ��Ա����"+"\t"+"����");
		for (int i=0; i<list.size(); i++) {
			list.get(i).outPut();
		}
		System.out.println("************");
		
		List<EmployeeInfo> list4 = emp.findEmployee("name", "Mary");
		List<EmployeeInfo> list5 = emp.findEmployee("age", "18");
		for (int i=0; i<list4.size(); i++) {
			list4.get(i).outPut();
		}
		for (int i=0; i<list5.size(); i++) {
			list5.get(i).outPut();
		}
	}

	@Test
	public void testAddEmployee() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		int result = 0; //��Ӱ�������
		
		emp.addEmployee(1, "Ryan", 18, "��", "ɽ��", "����", 3, "˶ʿ", "yes", 1, "123456");
		result = emp.addEmployee(2, "Mary", 18, "Ů", "NewYork", "UI", 3, "ѧʿ", "no", 1, "123456");
	}
	
	@Test
	public void testRmEmployee() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		int result = 0; //��Ӱ�������
		
		result = emp.rmEmployee(1);
	}
	
	@Test
	public void testUpdateEmployee() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		int result = 0; //��Ӱ�������
		
		emp.updateEmployee(6, "Ryan", 17, "��"
				, "UK", "DJ", 3, "doctor", "yes", 1, "qwe158");
		System.out.println("�ɹ�����");
		emp.updateEmployee(3, "education", "��ʿ");
	}

}
