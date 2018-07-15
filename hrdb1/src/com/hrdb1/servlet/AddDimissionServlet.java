package com.hrdb1.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrdb1.dao.IDeptDao;
import com.hrdb1.dao.IDimissionDao;
import com.hrdb1.dao.IEmployeeInfoDao;
import com.hrdb1.dao.IJobDao;
import com.hrdb1.dao.impl.DeptDaoImpl;
import com.hrdb1.dao.impl.DimissionDaoImpl;
import com.hrdb1.dao.impl.EmployeeInfoDaoImpl;
import com.hrdb1.dao.impl.JobDaoImpl;

/**
 * Servlet implementation class AddDimissionServlet
 */
//@WebServlet("/AddDimissionServlet")
public class AddDimissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddDimissionServlet() {
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
		IEmployeeInfoDao emp1 = new EmployeeInfoDaoImpl();
		IJobDao emp2 = new JobDaoImpl();
		
		// 如果添加信息不为空，则添加离职信息，删除员工信息表中该员工信息，岗位表实际人数减一
		Integer eid = Integer.parseInt(request.getParameter("eid"));
		String date = request.getParameter("date");
		Integer jid = Integer.parseInt(request.getParameter("jid"));
		String reason = request.getParameter("reason");
		if (eid != null && date != null && jid != null && reason != null) {
			result = emp.addDimission(eid, date, jid, reason);			
		}

		// 如果添加成功，则返回成功提示
		if (result == 1) {
			request.setAttribute("success", "1");
			emp1.rmEmployeeInfo(eid);
			emp2.updateJob(jid, "countreal", Integer.toString(emp2.findJob("jid", jid).get(0).getCountReal()-1));
		} else {
			request.setAttribute("success", "2");
		}

		request.getRequestDispatcher("admin/dimission.jsp").forward(request, response);
	}

}
