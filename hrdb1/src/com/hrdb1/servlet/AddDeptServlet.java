package com.hrdb1.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrdb1.dao.IDeptDao;
import com.hrdb1.dao.IDimissionDao;
import com.hrdb1.dao.IEntryDao;
import com.hrdb1.dao.impl.DeptDaoImpl;
import com.hrdb1.dao.impl.DimissionDaoImpl;
import com.hrdb1.dao.impl.EntryDaoImpl;

/**
 * Servlet implementation class AddDeptServlet
 */
//@WebServlet("/AddDeptServlet")
public class AddDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddDeptServlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int result = 0;

		IDeptDao emp = new DeptDaoImpl();

		// 如果添加信息不为空，则添加离职信息
		String name = request.getParameter("name");
		Integer minister = Integer.parseInt(request.getParameter("minister"));
		String sdept = request.getParameter("sdept");
		if (name != null && minister != null && sdept != null) {
			result = emp.addDept(name, minister, sdept);
		}

		// 如果添加成功，则返回成功提示
		if (result == 1) {
			request.setAttribute("success", "1");
		} else {
			request.setAttribute("success", "2");
		}

		request.getRequestDispatcher("admin/dept.jsp").forward(request, response);
	}

}
