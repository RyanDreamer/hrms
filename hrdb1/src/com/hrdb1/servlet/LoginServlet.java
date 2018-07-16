package com.hrdb1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrdb1.dao.IEmployeeInfoDao;
import com.hrdb1.dao.IJobDao;
import com.hrdb1.dao.impl.EmployeeInfoDaoImpl;
import com.hrdb1.dao.impl.JobDaoImpl;
import com.hrdb1.entity.EmployeeInfo;
import com.hrdb1.entity.Job;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 从前端的form表单获取用户名和密码
		String eid = (String) request.getParameter("eid");
		String password = (String) request.getParameter("password");

		// 从数据库中匹配密码
		// 新建结果集
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		list = emp.findEmployeeInfo("eid", eid);

		if (password.equals(list.get(0).getPassword())) {
			String uname = list.get(0).getName();
			request.getSession().setAttribute("uname", uname);
			
			IJobDao emp1 = new JobDaoImpl();

			List<Job> list1 = null;
			List<Job> list2 = null;
			List<Job> list3 = null;
			List<Job> list4 = null;
			List<Job> list5 = null;
			List<Job> list6 = null;
			list1 = emp1.findJob("dept", "研发部");
			list2 = emp1.findJob("dept", "质检部");
			list3 = emp1.findJob("dept", "销售部");
			list4 = emp1.findJob("dept", "行政部");
			list5 = emp1.findJob("dept", "人事部");
			list6 = emp1.findJob("dept", "财务部");
			int developementNum = 0;
			int qualityNum = 0;
			int salesNum = 0;
			int adminisNum = 0;
			int personnelNum = 0;
			int financeNum = 0;
			for (int i = 0; i < list1.size(); i++) {
				developementNum += list1.get(i).getCountReal();
			}
			for (int i = 0; i < list2.size(); i++) {
				qualityNum += list2.get(i).getCountReal();
			}
			for (int i = 0; i < list3.size(); i++) {
				salesNum += list3.get(i).getCountReal();
			}
			for (int i = 0; i < list4.size(); i++) {
				adminisNum += list4.get(i).getCountReal();
			}
			for (int i = 0; i < list5.size(); i++) {
				personnelNum += list5.get(i).getCountReal();
			}
			for (int i = 0; i < list6.size(); i++) {
				financeNum += list6.get(i).getCountReal();
			}
			request.getSession().setAttribute("developementNum", developementNum);
			request.getSession().setAttribute("qualityNum", qualityNum);
			request.getSession().setAttribute("salesNum", salesNum);
			request.getSession().setAttribute("adminisNum", adminisNum);
			request.getSession().setAttribute("personnelNum", personnelNum);
			request.getSession().setAttribute("financeNum", financeNum);

			request.getRequestDispatcher("admin/main.jsp").forward(request, response);// 匹配时跳转

		} else {
			request.setAttribute("success", "1");
			response.sendRedirect("/hrdb1/login/index.jsp");

		}
	}

}
