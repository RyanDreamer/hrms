package com.hrdb1.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import com.hrdb1.dao.IJobDao;
import com.hrdb1.entity.Job;
import com.hrdb1.util.BaseDao;

public class JobDaoImpl implements IJobDao {
	
private BaseDao baseDao;
	
	/**
	 * 查询所有员工信息
	 */

	@Override
	public List<Job> showJob() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<Job> list = new ArrayList<Job>();
		String sql = "select * from job";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer jid = rs.getInt("jid");
				String title = rs.getString("title");
				String dept = rs.getString("dept");
				Integer countDemand = rs.getInt("countDemand");
				Integer countReal = rs.getInt("countReal");
				Integer salary = rs.getInt("salary");
				
				Job emp = new Job(jid, title, dept, countDemand, countReal, salary);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int addJob(int jid, String title, String dept, int countDemand, int countReal, int salary) {
		// TODO Auto-generated method stub
        baseDao = new BaseDao();
		
		//影响行数
		int result = 0;
		String sql = "insert into job values(?,?,?,?,?,?)";	
		
		//调用baseDao的函数执行插入操作
		//用executeUpdate(sql, params),要先把传进的参数转成List
		List<Object> list = new ArrayList<Object>();
		list.add(jid);
		list.add(title);
		list.add(dept);
		list.add(countDemand);
		list.add(countReal);
		list.add(salary);
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
