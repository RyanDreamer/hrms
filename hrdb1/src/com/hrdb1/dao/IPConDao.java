package com.hrdb1.dao;
import java.sql.Date;
import java.util.List;

import com.hrdb1.entity.Job;
import com.hrdb1.entity.PCon;

public interface IPConDao {
	
	/**
	 * 查询所有试用员工信息
	 * @param datas
	 * @return
	 */
	
public List<PCon> showPCon();

public List<PCon> findPCon(String col, String param);
	
	/**
	 * 插入一条试用员工信息
	 * @param id
	 * @param salary
	 * @param startdate
	 * @param deadline
	 * @param eid
	 * @param jid
	 * @return
	 */
	
	public int addPCon(int id, int salary, Date startdate, Date deadline, int eid, int jid);
	
	/**
	 * 根据合同序号删除部门数据
	 * @param name
	 * @return 受影响的行数
	 */
	public int rmPCon(int id);
	
	/**
	 * 更新试用员工的信息，可分条改，也可全部改
	 * @return 受影响的行数
	 */
	public int updatePCon(int id, int salary, Date startdate, Date deadline, int eid, int jid);
	public int updatePCon(int id, String col, String value);

}
