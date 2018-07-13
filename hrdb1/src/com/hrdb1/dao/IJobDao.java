package com.hrdb1.dao;

import java.util.List;

import com.hrdb1.entity.Dept;
import com.hrdb1.entity.Job;



public interface IJobDao {
	/**
	 * ��ѯ���и�λ��Ϣ
	 * @param datas
	 * @return
	 */
	
public List<Job> showJob();

public List<Job> findJob(String col, Object param);
	
	/**
	 * ����һ����λ��Ϣ
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
	 * ���ݲ�����ɾ����������
	 * @param name
	 * @return ��Ӱ�������
	 */
	public int rmJob(int jid);
	
	/**
	 * ���²��ŵ���Ϣ���ɷ����ģ�Ҳ��ȫ����
	 * @return ��Ӱ�������
	 */
	public int updateJob(int jid, String title, String dept, int countDemand, int countReal, int salary);
	public int updateJob(int jid, String col, String value);

}
