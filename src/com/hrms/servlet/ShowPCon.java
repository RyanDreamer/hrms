package com.hrms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IPConDao;
import com.hrms.dao.impl.PConDaoImpl;
import com.hrms.entity.PCon;

/**
 * Servlet implementation class ShowPCon
 */
//@WebServlet("/ShowPCon")
public class ShowPCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		IPConDao pc = new PConDaoImpl();
		List<PCon> list = pc.showPCon();
		
		request.setAttribute("info", list);
		
		request.getRequestDispatcher("/admin/pcon.jsp").forward(request, response);
	}

}
