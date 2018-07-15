package com.hrms.dao;

import java.util.List;
import com.hrms.entity.PTrans;

public interface IPTransDao {
	
	/**
	 * ��ѯ����Ա����Ϣ
	 * @param datas
	 * @return
	 */
	
public List<PTrans> showPTrans();

public List<PTrans> findPTrans(String col, String param);
	
	/**
	 * ����һ��������Ϣ
	 * @param eid
	 * @param prejob
	 * @param nextjob
	 * @param predept
	 * @param nextdept
	 * @param date
	 * @param PS
	 * @return
	 */
	
	public int addPTrans(int eid, int prejob, int nextjob, String predept, String nextdept, String date, String PS);
	
	/**
	 * ����Ա����ɾ����������
	 * @param name
	 * @return ��Ӱ�������
	 */
	public int rmPTrans(int eid);
	
	/**
	 * ���µ�������Ϣ���ɷ����ģ�Ҳ��ȫ����
	 * @return ��Ӱ�������
	 */
	public int updatePTrans(int eid, int prejob, int nextjob, String predept, String nextdept, String date, String PS);
	
	public int updatePTrans(int eid, String col, String value);

}
