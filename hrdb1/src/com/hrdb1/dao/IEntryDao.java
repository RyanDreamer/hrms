package com.hrdb1.dao;
import java.sql.Date;
import java.util.List;

import com.hrdb1.entity.Entry;



public interface IEntryDao {
	/**
	 * 查询所有员工信息
	 * @param datas
	 * @return
	 */
	
public List<Entry> showEntry();
	
	/**
	 * 插入一条员工信息
	 * @param eid
	 * @param date
	 * @param jid
	 * @param dept
	 * @return
	 */
	
	public int addEntry(int eid,Date date, int jid, String dept );

}
