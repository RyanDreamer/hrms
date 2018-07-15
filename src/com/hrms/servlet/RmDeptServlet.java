package com.hrms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IDeptDao;
import com.hrms.dao.IDimissionDao;
import com.hrms.dao.impl.DeptDaoImpl;
import com.hrms.dao.impl.DimissionDaoImpl;

/**
 * Servlet implementation class RmDeptServlet
 */
//@WebServlet("/RmDeptServlet")
public class RmDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RmDeptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int result = 0;

		IDeptDao emp = new DeptDaoImpl();

		// 如果添加信息不为空，则添加离职信息
		String name = request.getParameter("name");

		if (name != null) {
			result = emp.rmDept(name);
		}

		// 如果添加成功，则返回成功提示
		if (result == 1) {
			request.setAttribute("success", "3");
		} else {
			request.setAttribute("success", "4");
		}

		request.getRequestDispatcher("admin/dept.jsp").forward(request, response);
	}

}
