package com.hrdb1.dao;
import java.sql.Date;
import java.util.List;

import com.hrdb1.entity.Entry;



public interface IEntryDao {
	/**
	 * ��ѯ����Ա����Ϣ
	 * @param datas
	 * @return
	 */
	
public List<Entry> showEntry();
	
	/**
	 * ����һ��Ա����Ϣ
	 * @param eid
	 * @param date
	 * @param jid
	 * @param dept
	 * @return
	 */
	
	public int addEntry(int eid,Date date, int jid, String dept );

}
