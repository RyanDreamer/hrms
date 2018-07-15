package com.hrms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IJobDao;
import com.hrms.dao.IPTransDao;
import com.hrms.dao.impl.JobDaoImpl;
import com.hrms.dao.impl.PTransDaoImpl;

/**
 * Servlet implementation class AddPtrans
 */
//@WebServlet("/AddPtrans")
public class AddPtrans extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//获取PTrans操作对象
		IPTransDao pt = new PTransDaoImpl();
		IJobDao job = new JobDaoImpl();
		int result = 0; //受影响行数
		
		//获取变量
		Integer eid = Integer.parseInt(request.getParameter("eid"));
		Integer preJob = Integer.parseInt(request.getParameter("preJob"));
		Integer nextJob = Integer.parseInt(request.getParameter("nextJob"));
		String preDept = null;
		String nextDept = null;
		String date = request.getParameter("date");
		String PS = request.getParameter("PS");
		
		//查找preDept和nextDept
		preDept = job.findJob("jid", preJob).get(0).getDept();
		nextDept = job.findJob("jid", nextJob).get(0).getDept();
		//调用添加方法添加数据
		result = pt.addPTrans(eid, preJob, nextJob, preDept, nextDept, date, PS);
		
		//如果添加成功，则返回成功提示
		if (result != 0) {
			//并更改相应的岗位表
			
			job.updateJob(preJob, "countReal", Integer.toString(job.findJob("jid", preJob).get(0).getCountReal()-1));
			job.updateJob(nextJob, "countReal", Integer.toString(job.findJob("jid", nextJob).get(0).getCountReal()+1));
			request.setAttribute("successA", "1");
		}
		else {
			request.setAttribute("successA", null);
		}
		
		request.getRequestDispatcher("admin/ptrans.jsp").forward(request, response);
		
	}

}
