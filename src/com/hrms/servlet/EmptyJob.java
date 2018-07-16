package com.hrms.servlet;

import java.io.IOException;
import java.util.ArrayList;
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
 * Servlet implementation class EmptyJob
 */
//@WebServlet("/EmptyJob")
public class EmptyJob extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int result=0;
		//获取所有信息，传入前端
		IJobDao emp = new JobDaoImpl();
		List<Job> listAll = emp.showJob();
		List<Job> list = new ArrayList<Job>();
		
		//找到有空闲的岗位，并放入新的list
		int j=0;
		for (int i=0; i<listAll.size(); i++) {
			if (listAll.get(i).getCountDemand() != listAll.get(i).getCountReal()) {
				list.add(j++, listAll.get(i));
			}
		}
		
		
		request.setAttribute("emptyJob", list);
		
		request.getRequestDispatcher("admin/main.jsp").forward(request, response);
	}

}
