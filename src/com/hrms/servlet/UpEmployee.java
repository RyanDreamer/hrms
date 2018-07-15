package com.hrms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IEmployeeInfoDao;
import com.hrms.dao.impl.EmployeeInfoDaoImpl;

/**
 * Servlet implementation class UpEmployee
 */
//@WebServlet("/UpEmployee")
public class UpEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int result=0;
		
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
	
		
		Integer eid = Integer.parseInt(request.getParameter("eid"));
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		String hometown = request.getParameter("hometown");
		String oldJob = request.getParameter("oldJob");
		String experience = request.getParameter("experience");
		String education = request.getParameter("education");
		String cet4 = request.getParameter("cet4");
		String family = request.getParameter("family");
		String password = request.getParameter("password");
		
		
		if (name!=null) {
			result += emp.updateEmployee(eid, "name", name);
		}
		if (age!=null) {
			result += emp.updateEmployee(eid, "age", age);
		}
		if (sex!=null) {
			result += emp.updateEmployee(eid, "sex", sex);
		}
		if (hometown!=null) {
			result += emp.updateEmployee(eid, "hometown", hometown);
		}
		if (oldJob!=null) {
			result += emp.updateEmployee(eid, "oldJob", oldJob);
		}
		if (experience!=null) {
			result += emp.updateEmployee(eid, "experience", experience);
		}
		if (education!=null) {
			result += emp.updateEmployee(eid, "education", education);
		}
		
		if (cet4!=null) {
			result += emp.updateEmployee(eid, "cet4", cet4);
		}
		if (family!=null) {
			result += emp.updateEmployee(eid, "family", family);
		}
		if (password!=null) {
			result += emp.updateEmployee(eid, "password", password);
		}
		
			
		//如果修改成功，则返回成功提示
		if (result != 0) {
			request.setAttribute("successU", "1");
		}
		else {
			request.setAttribute("successU", null);
		}
		
		request.getRequestDispatcher("admin/employee.jsp").forward(request, response);
		
	}

}
