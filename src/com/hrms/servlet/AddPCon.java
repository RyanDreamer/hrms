package com.hrms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IPConDao;
import com.hrms.dao.impl.PConDaoImpl;

/**
 * Servlet implementation class AddPCon
 */
//@WebServlet("/AddPCon")
public class AddPCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int result = 0;
		IPConDao pc = new PConDaoImpl();
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		Integer salary = Integer.parseInt(request.getParameter("salary"));
		String startDate = request.getParameter("startDate");
		String deadline = request.getParameter("deadline");
		Integer eid = Integer.parseInt(request.getParameter("eid"));
		Integer jid = Integer.parseInt(request.getParameter("jid"));
		
		result = pc.addPCon(id, salary, startDate, deadline, eid, jid);
		
		if (result != 0) {
			request.setAttribute("successA", "1");
		}
		else {
			request.setAttribute("successA", null);
		}
		
		request.getRequestDispatcher("admin/pcon.jsp").forward(request, response);
	}

}
