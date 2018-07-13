package com.hrdb1.dao;

import java.util.List;

import com.hrdb1.entity.Dept;
import com.hrdb1.entity.Job;



public interface IJobDao {
	/**
	 * 查询所有岗位信息
	 * @param datas
	 * @return
	 */
	
public List<Job> showJob();

public List<Job> findJob(String col, Object param);
	
	/**
	 * 插入一条岗位信息
	 * @param jid
	 * @param title
	 * @param dept
	 * @param countDemand
	 * @param countReal
	 * @param salary
	 * @return
	 */
	
	public int addJob(int jid, String title, String dept, int countDemand, int countReal, int salary);
	
	/**
	 * 根据部门名删除部门数据
	 * @param name
	 * @return 受影响的行数
	 */
	public int rmJob(int jid);
	
	/**
	 * 更新部门的信息，可分条改，也可全部改
	 * @return 受影响的行数
	 */
	public int updateJob(int jid, String title, String dept, int countDemand, int countReal, int salary);
	public int updateJob(int jid, String col, String value);

}
