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
		emp.addEmployeeInfo(1,"����",11,"��","ɽ��","����Ա",11,"��","yes",3,"");
		
		emp.addEmployeeInfo(2,"Hary",22,"��","����","��Ա",41,"��","yes",3,"");
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
			System.out.print(list.get(i).getFamily() + "	");
			System.out.println(list.get(i).getPassword());
			
		}
	}
	
	@Test
	public void testfindEmployeeInfo() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		String col = "eid";
		String param = "1";
		List<EmployeeInfo> list = null;
		list=emp.findEmployeeInfo(col, param);
		System.out.println("eid"+"\t"+ "name"+"\t"+"age"+"\t"+"sex "+"\t"+"hometown "+"\t"+"oldJob"+"\t"+"experience"+"\t"+"education "+"\t"+"cet4 "+"\t"+"family "+"\t");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getEid() + "	");
			System.out.print(list.get(i).getName() + "		");
			System.out.print(list.get(i).getAge() + "		");
			System.out.print(list.get(i).getSex() + "	");
			System.out.print(list.get(i).getHometowm() + "		");
			System.out.print(list.get(i).getOldjob() + "		");
			System.out.print(list.get(i).getExperience() + "	");
			System.out.print(list.get(i).getEducation() + "		");
			System.out.print(list.get(i).getCet4() + "		");
			System.out.print(list.get(i).getFamily() + "	");
			System.out.println(list.get(i).getPassword());
		}
	}
	
	@Test
	public void testrmEmployeeInfo() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		int result = 0; //��Ӱ�������	
		result = emp.rmEmployeeInfo(2);
		System.out.println("ɾ����Ӱ������:"+result);
	}
	
	@Test
	public void testupdateEmployeeInfo() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		int result = 0; //��Ӱ�������	
		result = emp.updateEmployeeInfo(2, "����", 11, "��", "ɽ��", "����Ա", 11, "����", "no", 5,"");
		System.out.println("�޸���Ӱ������:"+result);
	}
	
	@Test
	public void testupdateEmployeeInfoP() {
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		int result = 0; //��Ӱ�������	
		result = emp.updateEmployeeInfo(2, "cet4", "yes");
		System.out.println("�޸���Ӱ������:"+result);
	}

}
