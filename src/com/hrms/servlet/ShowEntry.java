package com.hrms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IEntryDao;
import com.hrms.dao.impl.EntryDaoImpl;
import com.hrms.entity.Entry;

/**
 * Servlet implementation class ShowEntry
 */
//@WebServlet("/ShowEntry")
public class ShowEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		IEntryDao entry = new EntryDaoImpl();
		List<Entry> list = entry.showEntry();
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("admin/entry.jsp").forward(request, response);
	}

}
