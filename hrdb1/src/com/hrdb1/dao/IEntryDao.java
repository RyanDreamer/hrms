package com.hrdb1.dao;

import java.util.List;
import com.hrdb1.entity.Entry;

public interface IEntryDao {
	/**
	 * 查询所有入职信息
	 * @param datas
	 * @return
	 */
	
public List<Entry> showEntry();

public List<Entry> findEntry(String col, String param);
	
	/**
	 * 插入一条入职信息
	 * @param eid
	 * @param date
	 * @param jid
	 * @param dept
	 * @return
	 */
	
	public int addEntry(int eid,String date, int jid, String dept );
	
	/**
	 * 根据部门名删除部门数据
	 * @param name
	 * @return 受影响的行数
	 */
	public int rmEntry(int eid);
	
	/**
	 * 更新部门的信息，可分条改，也可全部改
	 * @return 受影响的行数
	 */
	public int updateEntry(int eid,String date, int jid, String dept);
	
	public int updateEntry(int eid, String col, String value);
	

}
