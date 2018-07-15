package com.hrms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IJobDao;
import com.hrms.dao.impl.JobDaoImpl;
import com.hrms.entity.Job;

/**
 * Servlet implementation class RmJobServlet
 */
//@WebServlet("/RmJobServlet")
public class RmJobServlet extends HttpServlet {
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
		
		if (jid!=null) {
			result = emp.rmJob(jid);
		}
			
		//如果添加成功，则返回成功提示
		if (result == 1) {
			request.setAttribute("success", "1");
		}
		else {
			request.setAttribute("success", null);
		}
		
		request.getRequestDispatcher("admin/job.jsp").forward(request, response);
	}

}
