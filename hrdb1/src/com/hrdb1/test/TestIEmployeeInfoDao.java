package com.hrdb1.test;

import java.util.List;

import org.junit.Test;

import com.hrdb1.dao.IEmployeeInfoDao;
import com.hrdb1.dao.impl.EmployeeInfoDaoImpl;
import com.hrdb1.entity.EmployeeInfo;


public class TestIEmployeeInfoDao {

	@Test
	public void testaddEmployeeInfo() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		emp.addEmployeeInfo(1,"高翔",11,"男","山西","程序员",11,"无","yes",3);
		
		emp.addEmployeeInfo(2,"Hary",22,"男","陕西","序员",41,"无","yes",3);
	}
	
	@Test
	public void testshowEmployeeInfo() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		List<EmployeeInfo> list = emp.showEmployeeInfo();
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getEid() + "	");
			System.out.print(list.get(i).getName() + "	");
			System.out.print(list.get(i).getAge() + "	");
			System.out.print(list.get(i).getSex() + "	");
			System.out.print(list.get(i).getHometowm() + "	");
			System.out.print(list.get(i).getOldjob() + "	");
			System.out.print(list.get(i).getExperience() + "	");
			System.out.print(list.get(i).getEducation() + "	");
			System.out.print(list.get(i).getCet4() + "	");
			System.out.println(list.get(i).getFamily());
			
		}
	}

}
