package com.hrdb1.dao;
import java.sql.Date;
import java.util.List;

import com.hrdb1.entity.PCon;

public interface IPConDao {
	
	/**
	 * ��ѯ����Ա����Ϣ
	 * @param datas
	 * @return
	 */
	
public List<PCon> showPCon();
	
	/**
	 * ����һ��Ա����Ϣ
	 * @param id
	 * @param salary
	 * @param startdate
	 * @param deadline
	 * @param eid
	 * @param jid
	 * @return
	 */
	
	public int addPCon(int id, int salary, Date startdate, Date deadline, int eid, int jid);

}
