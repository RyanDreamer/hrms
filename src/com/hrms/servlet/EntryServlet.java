package com.hrms.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IEntryDao;
import com.hrms.dao.IJobDao;
import com.hrms.dao.impl.EntryDaoImpl;
import com.hrms.dao.impl.JobDaoImpl;

/**
 * Servlet implementation class EntryServlet
 */
//@WebServlet("/EntryServlet")
public class EntryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EntryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		IEntryDao entry = new EntryDaoImpl();
		int result = 0;
		
		int eid = Integer.parseInt(request.getParameter("eid"));
		String dept = request.getParameter("dept");
		int jid = Integer.parseInt(request.getParameter("jid"));
		String date = request.getParameter("date");
		
		result = entry.addEntry(eid, date, jid, dept);
		
		//如果添加成功，则返回成功提示
		if (result != 0) {
			//影响岗位表的实际人数
			IJobDao job = new JobDaoImpl();
			job.updateJob(jid, "countReal", Integer.toString(job.findJob("jid", jid).get(0).getCountReal()+1));
			request.setAttribute("successA", "1");
		}
		else {
			request.setAttribute("successA", null);
		}
		
		request.getRequestDispatcher("/admin/entry.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
