package com.hrms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IPTransDao;
import com.hrms.dao.impl.PTransDaoImpl;
import com.hrms.entity.PTrans;

/**
 * Servlet implementation class ShowPtrans
 */
//@WebServlet("/ShowPtrans")
public class ShowPtrans extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		IPTransDao pt = new PTransDaoImpl();
		List<PTrans> list = pt.showPTrans();
		
		request.setAttribute("info", list);
		
		request.getRequestDispatcher("/admin/ptrans.jsp").forward(request, response);
	}

}
