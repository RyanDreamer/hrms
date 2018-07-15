package com.hrms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.hrms.dao.IJobDao;
import com.hrms.entity.Job;
import com.hrms.util.BaseDao;

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
	public List<Job> findJob(String col, Object param){
		baseDao = new BaseDao();
		List<Job> list = new ArrayList<Job>();
		String sql = "select * from job where "+col+"=?";
		List<Object> params = new ArrayList<Object>();
		params.add(param);
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
	
	/* 
	 * 删除操作
	 */
	@Override
	public int rmJob(int jid) {
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
		String sql = "delete from job where jid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(jid);
		
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功删除"+jid+"号岗位的信息");
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
	public int updateJob(int jid, String title, String dept, int countDemand, int countReal, int salary) {
		int result = 0;
		//先删再插入
		rmJob(jid);
		result = addJob(jid, title, dept, countDemand, countReal, salary );
		
		return result;
		
	}
	
	/**
	 * 条件更新
	 */
	@Override
	public int updateJob(int jid, String col, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update job set "+col+"=? where jid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的岗位
		params.add(jid);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+jid+"号岗位的信息");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}

}
