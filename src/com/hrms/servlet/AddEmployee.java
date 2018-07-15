package com.hrms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IEmployeeInfoDao;
import com.hrms.dao.IJobDao;
import com.hrms.dao.impl.EmployeeInfoDaoImpl;
import com.hrms.dao.impl.JobDaoImpl;

/**
 * Servlet implementation class AddEmployee
 */
//@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int result=0;
		
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
	
		//如果添加信息不为空，则添加
		Integer eid = Integer.parseInt(request.getParameter("eid"));
		String name = request.getParameter("name");
		Integer age = Integer.parseInt(request.getParameter("age"));
		String sex = request.getParameter("sex");
		String hometown = request.getParameter("hometown");
		String oldJob = request.getParameter("oldJob");
		Integer experience = Integer.parseInt(request.getParameter("experience"));
		String education = request.getParameter("education");
		String cet4 = request.getParameter("cet4");
		Integer family = Integer.parseInt(request.getParameter("family"));
		String password = request.getParameter("password");
		
		
		if (eid!=null && name!=null && age!=null 
				&& sex!=null && hometown!=null
				&& oldJob!=null && experience!=null
				&& education!=null && cet4!= null
				&& family!=null && password!=null) {
			result = emp.addEmployee(eid, name, age, sex, hometown, oldJob, experience, education, cet4, family, password);
		}
			
		//如果添加成功，则返回成功提示
		if (result == 1) {
			request.setAttribute("successA", "1");
		}
		else {
			request.setAttribute("successA", null);
		}
		
		request.getRequestDispatcher("admin/employee.jsp").forward(request, response);
		
	}

}
