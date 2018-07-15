package com.hrms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IJobDao;
import com.hrms.dao.impl.JobDaoImpl;

/**
 * Servlet implementation class UpJobServlet
 */
//@WebServlet("/UpJobServlet")
public class UpJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int result=0;
		
		IJobDao emp = new JobDaoImpl();
	
		//如果添加信息不为空，则添加岗位
		Integer jid = Integer.parseInt(request.getParameter("jid"));
		String title = request.getParameter("title");
		String dept = request.getParameter("dept");
		String countDemand = request.getParameter("countDemand");
		String countReal = request.getParameter("countReal");
		String salary = request.getParameter("salary");
		if (title!=null) {
			result += emp.updateJob(jid, "title", title);
		}
		if (dept!=null) {
			result += emp.updateJob(jid, "dept", dept);
		}
		if (countDemand!=null) {
			result += emp.updateJob(jid, "countDemand", countDemand);
		}
		if (countReal!=null) {
			result += emp.updateJob(jid, "countReal", countReal);
		}
		if (salary!=null) {
			result += emp.updateJob(jid, "salary", salary);
		}
			
		//如果添加成功，则返回成功提示
		if (result != 0) {
			request.setAttribute("successU", "1");
		}
		else {
			request.setAttribute("successU", null);
		}
		
		request.getRequestDispatcher("admin/job.jsp").forward(request, response);
	}

}
