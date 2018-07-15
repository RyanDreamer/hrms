package com.hrms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IDeptDao;
import com.hrms.dao.IDimissionDao;
import com.hrms.dao.IEmployeeInfoDao;
import com.hrms.dao.impl.DeptDaoImpl;
import com.hrms.dao.impl.DimissionDaoImpl;
import com.hrms.dao.impl.EmployeeInfoDaoImpl;
import com.hrms.entity.Dept;
import com.hrms.entity.Dimission;
import com.hrms.entity.EmployeeInfo;

/**
 * Servlet implementation class ShowDeptServlet
 */
//@WebServlet("/ShowDeptServlet")
public class ShowDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowDeptServlet() {
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
		int result=0;
		//获取所有信息，传入前端
		IDeptDao emp = new DeptDaoImpl();
		List<Dept> list = emp.showDept();
		request.setAttribute("info", list);
		
		request.getRequestDispatcher("admin/dept.jsp").forward(request, response);
	}

}
