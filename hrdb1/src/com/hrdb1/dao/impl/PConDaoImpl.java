package com.hrdb1.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import com.hrdb1.dao.IPConDao;
import com.hrdb1.entity.PCon;
import com.hrdb1.util.BaseDao;

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
				Date startdate = rs.getDate("startdate");
				Date deadline = rs.getDate("deadline");
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
	public int addPCon(int id, int salary, Date startdate, Date deadline, int eid, int jid) {
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

}
