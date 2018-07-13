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

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.hrms.dao.IEmployeeInfoDao;
import com.hrms.dao.impl.EmployeeInfoDaoImpl;
import com.hrms.entity.EmployeeInfo;

/**
 * Servlet implementation class UserList
 */
//@WebServlet("/UserList")
public class UserList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IEmployeeInfoDao emp;
	
	public UserList() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		跳不过去，没有结果，404		
//		ServletContext context = this.getServletContext();
//		context.setAttribute("method", "userlist");
//		
//		String method = request.getParameter("method");
//		if (method.equals("userlist")) {
			userlist(request, response);
//		}
	}
	
	public void userlist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		emp = new EmployeeInfoDaoImpl();
		List<EmployeeInfo> list = emp.showEmployee();
		
		JSONArray userListJson = JSONArray.parseArray(JSON.toJSONString(list));
		
		response.setContentType("application/json; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println(userListJson);
	}
	
	 public void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	    }
	    
	    public void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	    }

}
