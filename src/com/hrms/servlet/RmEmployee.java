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
 * Servlet implementation class RmEmployee
 */
//@WebServlet("/RmEmployee")
public class RmEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int result=0;
		
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		Integer eid = Integer.parseInt(request.getParameter("eid"));
		if (eid!=null) {
			result = emp.rmEmployee(eid);
		}
		
		
		//如果添加成功，则返回成功提示
		if (result == 1) {
			request.setAttribute("successR", "1");
		}
		else {
			request.setAttribute("successR", null);
		}
		
		request.getRequestDispatcher("admin/employee.jsp").forward(request, response);
	}

}
