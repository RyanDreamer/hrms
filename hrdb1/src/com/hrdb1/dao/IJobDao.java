package com.hrdb1.dao;

import java.util.List;

import com.hrdb1.entity.Job;



public interface IJobDao {
	/**
	 * 查询所有员工信息
	 * @param datas
	 * @return
	 */
	
public List<Job> showJob();
	
	/**
	 * 插入一条员工信息
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
