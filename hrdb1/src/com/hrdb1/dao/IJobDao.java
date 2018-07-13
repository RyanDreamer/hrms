package com.hrdb1.dao;

import java.util.List;

import com.hrdb1.entity.Job;



public interface IJobDao {
	/**
	 * ��ѯ����Ա����Ϣ
	 * @param datas
	 * @return
	 */
	
public List<Job> showJob();
	
	/**
	 * ����һ��Ա����Ϣ
	 * @param jid
	 * @param title
	 * @param dept
	 * @param countDemand
	 * @param countReal
	 * @param salary
	 * @return
	 */
	
	public int addJob(int jid, String title, String dept, int countDemand, int countReal, int salary);

}
