package com.hrms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IDimissionDao;
import com.hrms.dao.impl.DimissionDaoImpl;

/**
 * Servlet implementation class RmDimissionServlet
 */
//@WebServlet("/RmDimissionServlet")
public class RmDimissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RmDimissionServlet() {
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

		IDimissionDao emp = new DimissionDaoImpl();

		// 如果删除信息不为空，则删除离职信息
		Integer eid = Integer.parseInt(request.getParameter("eid"));

		if (eid != null) {
			result = emp.rmDimission(eid);
		}

		// 如果删除成功，则返回成功提示
		if (result == 1) {
			request.setAttribute("success", "3");
		} else {
			request.setAttribute("success", "4");
		}

		request.getRequestDispatcher("admin/dimission.jsp").forward(request, response);
	}

}
