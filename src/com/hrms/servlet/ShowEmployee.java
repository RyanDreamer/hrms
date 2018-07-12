package com.hrms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IEmployeeInfoDao;
import com.hrms.dao.impl.EmployeeInfoDaoImpl;
import com.hrms.entity.EmployeeInfo;

/**
 * Servlet implementation class ShowEmployee
 */
//@WebServlet("/ShowEmployee")
public class ShowEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		

		
		PrintWriter out = response.getWriter();
		out.println("hello world");
		IEmployeeInfoDao emp = new EmployeeInfoDaoImpl();
		List<EmployeeInfo> list = emp.showEmployee();
		out.println("工号"+"\t"+ "姓名"+"\t"+"年龄"+"\t"+
						"性别"+"\t"+"籍贯"+"\t"+"上个职业"+"\t"+"工作年数"+"\t"+
						"学历"+"\t"+"英语四级"+"\t"+"家庭成员人数");
		for (int i=0; i<list.size(); i++) {
			out.print(list.get(i).getEid()+"\t");
			out.print(list.get(i).getName()+"\t");
			out.print(list.get(i).getAge()+"\t");
			out.print(list.get(i).getSex()+"\t");
			out.print(list.get(i).getHometown()+"\t");
			out.print(list.get(i).getOldJob()+"\t");
			out.print(list.get(i).getExperience()+"\t");
			out.print(list.get(i).getEducation()+"\t");
			out.print(list.get(i).getCet4()+"\t");
			out.print(list.get(i).getFamily()+"\t");
			out.println();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
