package com.hrdb1.dao;
import java.sql.Date;
import java.util.List;
import com.hrdb1.entity.Dimission;

public interface IDimissionDao {
	
	/**
	 * 查询所有员工信息
	 * @param datas
	 * @return
	 */
	public List<Dimission> showDimission();
	
	/**
	 * 插入一条员工信息
	 * @param eid
	 * @param date
	 * @param jid
	 * @param reason
	 * @return
	 */
	
	public int addDimission(int eid,Date date, int jid, String reason );
}
