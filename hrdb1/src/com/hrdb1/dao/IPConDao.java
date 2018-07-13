package com.hrdb1.dao;
import java.sql.Date;
import java.util.List;

import com.hrdb1.entity.PCon;

public interface IPConDao {
	
	/**
	 * 查询所有员工信息
	 * @param datas
	 * @return
	 */
	
public List<PCon> showPCon();
	
	/**
	 * 插入一条员工信息
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
