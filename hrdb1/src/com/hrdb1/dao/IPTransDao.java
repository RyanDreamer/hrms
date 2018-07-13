package com.hrdb1.dao;
import java.sql.Date;
import java.util.List;

import com.hrdb1.entity.PCon;
import com.hrdb1.entity.PTrans;

public interface IPTransDao {
	
	/**
	 * 查询所有员工信息
	 * @param datas
	 * @return
	 */
	
public List<PTrans> showPTrans();

public List<PTrans> findPTrans(String col, String param);
	
	/**
	 * 插入一条调动信息
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
	
	/**
	 * 根据员工号删除调动数据
	 * @param name
	 * @return 受影响的行数
	 */
	public int rmPTrans(int eid);
	
	/**
	 * 更新调动的信息，可分条改，也可全部改
	 * @return 受影响的行数
	 */
	public int updatePTrans(int eid, int prejob, int nextjob, String predept, String nextdept, Date date, String pS);
	public int updatePTrans(int eid, String col, String value);

}
