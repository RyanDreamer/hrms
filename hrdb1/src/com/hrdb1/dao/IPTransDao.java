package com.hrdb1.dao;
import java.sql.Date;
import java.util.List;

import com.hrdb1.entity.PTrans;

public interface IPTransDao {
	
	/**
	 * ��ѯ����Ա����Ϣ
	 * @param datas
	 * @return
	 */
	
public List<PTrans> showPTrans();
	
	/**
	 * ����һ��Ա����Ϣ
	 * @param eid
	 * @param prejob
	 * @param nextjob
	 * @param predept
	 * @param nextdept
	 * @param date
	 * @param PS
	 * @return
	 */
	
	public int addPTrans(int eid, int prejob, int nextjob, String predept, String nextdept, Date date, String pS);

}
