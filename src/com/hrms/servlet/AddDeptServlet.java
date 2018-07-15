package com.hrms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IDeptDao;
import com.hrms.dao.IDimissionDao;
import com.hrms.dao.IEntryDao;
import com.hrms.dao.impl.DeptDaoImpl;
import com.hrms.dao.impl.DimissionDaoImpl;
import com.hrms.dao.impl.EntryDaoImpl;

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

		// ��������Ϣ��Ϊ�գ��������ְ��Ϣ
		String name = request.getParameter("name");
		Integer minister = Integer.parseInt(request.getParameter("minister"));
		String sdept = request.getParameter("sdept");
		if (name != null && minister != null && sdept != null) {
			result = emp.addDept(name, minister, sdept);
		}

		// �����ӳɹ����򷵻سɹ���ʾ
		if (result == 1) {
			request.setAttribute("success", "1");
		} else {
			request.setAttribute("success", "2");
		}

		request.getRequestDispatcher("admin/dept.jsp").forward(request, response);
	}

}
