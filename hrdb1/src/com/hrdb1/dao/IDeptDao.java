package com.hrdb1.dao;
import java.util.List;
import com.hrdb1.entity.Dept;
public interface IDeptDao {
	
	/**
	 * 查询所有部门信息
	 * @param datas
	 * @return
	 */
	public List<Dept> showDept();
	
	public List<Dept> findDept(String col, Object param);
	
	/**
	 * 插入一条部门信息
	 * @param name
	 * @param minister
	 * @param sdept
	 * @return
	 */
	public int addDept(String name, int minister, String sdept );
	
	/**
	 * 根据部门名删除部门数据
	 * @param name
	 * @return 受影响的行数
	 */
	public int rmDept(String name);
	
	/**
	 * 更新部门的信息，可分条改，也可全部改
	 * @return 受影响的行数
	 */
	public int updateDept(String name, int minister, String sdept);
	public int updateDept(String name, String col, String value);
}

