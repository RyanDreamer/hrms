package com.hrdb1.dao;
import java.sql.Date;
import java.util.List;

import com.hrdb1.entity.Dept;
import com.hrdb1.entity.Dimission;

public interface IDimissionDao {
	
	/**
	 * 查询所有离职信息
	 * @param datas
	 * @return
	 */
	public List<Dimission> showDimission();
	
	public List<Dimission> findDimission(String col, String param);
	
	/**
	 * 插入一条离职信息
	 * @param eid
	 * @param date
	 * @param jid
	 * @param reason
	 * @return
	 */
	
	public int addDimission(int eid,Date date, int jid, String reason );
	
	/**
	 * 根据部门名删除离职数据
	 * @param name
	 * @return 受影响的行数
	 */
	public int rmDimission(int eid);
	
	/**
	 * 更新离职的信息，可分条改，也可全部改
	 * @return 受影响的行数
	 */
	public int updateDimission(int eid,Date date, int jid, String reason);
	public int updateDimission(int eid, String col, String value);
}
