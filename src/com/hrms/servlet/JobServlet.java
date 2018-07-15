package com.hrms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IEmployeeInfoDao;
import com.hrms.dao.IJobDao;
import com.hrms.dao.impl.EmployeeInfoDaoImpl;
import com.hrms.dao.impl.JobDaoImpl;
import com.hrms.entity.EmployeeInfo;
import com.hrms.entity.Job;

/**
 * Servlet implementation class Job
 */
//@WebServlet("/Job")
public class JobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int result=0;
		//获取所有信息，传入前端
		IJobDao emp = new JobDaoImpl();
		List<Job> list = emp.showJob();
		request.setAttribute("info", list);
		
		request.getRequestDispatcher("admin/job.jsp").forward(request, response);
	}

}
