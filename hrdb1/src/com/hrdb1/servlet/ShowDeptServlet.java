package com.hrdb1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrdb1.dao.IDeptDao;
import com.hrdb1.dao.IDimissionDao;
import com.hrdb1.dao.IEmployeeInfoDao;
import com.hrdb1.dao.impl.DeptDaoImpl;
import com.hrdb1.dao.impl.DimissionDaoImpl;
import com.hrdb1.dao.impl.EmployeeInfoDaoImpl;
import com.hrdb1.entity.Dept;
import com.hrdb1.entity.Dimission;
import com.hrdb1.entity.EmployeeInfo;

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
