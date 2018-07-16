package com.hrms.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.dao.IEntryDao;
import com.hrms.dao.IJobDao;
import com.hrms.dao.impl.EntryDaoImpl;
import com.hrms.dao.impl.JobDaoImpl;
import com.hrms.entity.Entry;
import com.hrms.entity.Job;

/**
 * Servlet implementation class CountEntry
 */
//@WebServlet("/CountEntry")
public class CountEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		List<Entry> listAll = null;
		List<Entry> list = new ArrayList<Entry>();
		IJobDao job = new JobDaoImpl();
		List<Job> joblist = job.showJob();
		
		//ȡ����ʱ�䷶Χ�ڵ�����
		IEntryDao entry = new EntryDaoImpl();
		listAll = entry.showEntry();
		int j = 0;
		for (int i=0; i<listAll.size(); i++) {
			if (listAll.get(i).getDate().compareTo(start)>0
					&& listAll.get(i).getDate().compareTo(end)<0) {
				list.add(j++, listAll.get(i));
			}
		}
		
		//�½�һ���������飬���ڼ�¼��λ�ź���ְ�������±�Ϊ��λ��
		int record[];
		record = new int[joblist.size()];
		//��ʼ��Ϊ0��0��ʾ��¼��û�������λ��
		for (int i=0; i<joblist.size(); i++) {
			record[i] = 0;
		}
		
		for (int i=0; i<list.size(); i++) {
			record[list.get(i).getJid()-1]++;
		}
		
		request.setAttribute("Entry", record);
		
		request.getRequestDispatcher("admin/main2.jsp").forward(request, response);
	}

}