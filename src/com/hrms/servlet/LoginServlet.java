package com.hrms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IEmployeeInfoDao;
import com.hrms.dao.impl.EmployeeInfoDaoImpl;
import com.hrms.entity.EmployeeInfo;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//从前端的form表单获取用户名和密码
		String eid = (String) request.getParameter("eid");
		String password = (String) request.getParameter("password");
		
		
		//从数据库中匹配密码
		//新建结果集
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		list = emp.findEmployee("eid", eid);
		if (password.equals(list.get(0).getPassword())) {
			request.setAttribute("success", null);
			response.sendRedirect("/hrms/admin/main.jsp");//匹配时跳转
		}
		else {
			request.setAttribute("success", "0");
			request.getRequestDispatcher("/login/index.jsp").forward(request,response);
		}
	}
	
}
