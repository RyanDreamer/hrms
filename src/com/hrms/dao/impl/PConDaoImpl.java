package com.hrms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.hrms.dao.IPConDao;
import com.hrms.entity.PCon;
import com.hrms.util.BaseDao;

public class PConDaoImpl implements IPConDao {
	
private BaseDao baseDao;
	
	/**
	 * 查询所有员工信息
	 */

	@Override
	public List<PCon> showPCon() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<PCon> list = new ArrayList<PCon>();
		String sql = "select * from PCon";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer id = rs.getInt("id");
				Integer salary = rs.getInt("salary");
				String startdate = rs.getString("startdate");
				String deadline = rs.getString("deadline");
				Integer eid = rs.getInt("eid");
				Integer jid = rs.getInt("jid");
				
				PCon emp = new PCon(id, salary, startdate, deadline, eid, jid);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<PCon> findPCon(String col, String param){
		baseDao = new BaseDao();
		List<PCon> list = new ArrayList<PCon>();
		String sql = "select * from pcon where "+col+"=?";
		List<Object> params = new ArrayList<Object>();
		params.add(param);
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer id = rs.getInt("id");
				Integer salary  = rs.getInt("salary");
				String startDate = rs.getString("startDate");
				String deadline = rs.getString("deadline");
				Integer eid  = rs.getInt("eid");
				Integer jid  = rs.getInt("jid");
				
				PCon emp = new PCon(id, salary, startDate, deadline, eid, jid);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int addPCon(int id, int salary, String startdate, String deadline, int eid, int jid) {
		// TODO Auto-generated method stub
        baseDao = new BaseDao();
		
		//影响行数
		int result = 0;
		String sql = "insert into PCon values(?,?,?,?,?,?)";	
		
		//调用baseDao的函数执行插入操作
		//用executeUpdate(sql, params),要先把传进的参数转成List
		List<Object> list = new ArrayList<Object>();
		list.add(id);
		list.add(salary);
		list.add(startdate);
		list.add(deadline);
		list.add(eid);
		list.add(jid);
		result = baseDao.executeUpdate(sql, list);
		
		//打印结果信息
		if (result != 0) {
			System.out.println("成功插入，影响了"+result+"行，恭喜");
		}
		else {
			System.out.println("Sorry,失败了");
		}
		
		return result;
	}
	
	/* 
	 * 删除操作
	 */
	@Override
	public int rmPCon(int id) {
		baseDao = new BaseDao();
		// TODO Auto-generated method stub
		//影响行数
		int result = 0;
		//让用户确认要删除
		int x = 1;
		if (x != 1) {
			System.out.println("已取消操作");
			return 0;
		}
		//开始删除
		String sql = "delete from pcon where id=?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功删除"+id+"号合同的信息");
		}
		else {
			System.out.println("没能成功删除");
		}
		
		return result;
	}
	
	/**
	 * 更新操作
	 */
	@Override
	public int updatePCon(int id, int salary, String startdate, String deadline, int eid, int jid) {
		int result = 0;
		//先删再插入
		rmPCon(id);
		result = addPCon(id, salary, startdate, deadline, eid, jid );
		
		return result;
		
	}
	
	/**
	 * 条件更新
	 */
	@Override
	public int updatePCon(int id, String col, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update pcon set "+col+"=? where id=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的岗位
		params.add(id);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+id+"号合同的信息");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}


}
