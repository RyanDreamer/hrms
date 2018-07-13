package com.hrdb1.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.hrdb1.dao.IPTransDao;
import com.hrdb1.entity.PTrans;
import com.hrdb1.util.BaseDao;

public class PTransDaoImpl implements IPTransDao {
	
private BaseDao baseDao;
	
	/**
	 * 查询所有员工信息
	 */

	@Override
	public List<PTrans> showPTrans() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<PTrans> list = new ArrayList<PTrans>();
		String sql = "select * from PTrans";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				Integer prejob = rs.getInt("prejob");
				Integer nextjob = rs.getInt("nextjob");
				String predept = rs.getString("predept");
				String nextdept = rs.getString("nextdept");
				String date = rs.getString("date");
				String pS = rs.getString("pS");
				
				PTrans emp = new PTrans(eid, prejob, nextjob, predept, nextdept, date, pS);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<PTrans> findPTrans(String col, String param){
		baseDao = new BaseDao();
		List<PTrans> list = new ArrayList<PTrans>();
		String sql = "select * from ptrans where "+col+"=?";
		List<Object> params = new ArrayList<Object>();
		params.add(param);
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				Integer preJob = rs.getInt("preJob");
				Integer nextJob  = rs.getInt("nextJob");
				String preDept = rs.getString("preDept");
				String nextDept = rs.getString("nextDept");
				String date = rs.getString("date");
				String PS  = rs.getString("PS");
				
				PTrans emp = new PTrans(eid, preJob, nextJob, preDept, nextDept, date, PS);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public int addPTrans(int eid, int prejob, int nextjob, String predept, String nextdept, String date, String pS) {
		// TODO Auto-generated method stub
        baseDao = new BaseDao();
		
		//影响行数
		int result = 0;
		String sql = "insert into PTrans values(?,?,?,?,?,?,?)";	
		
		//调用baseDao的函数执行插入操作
		//用executeUpdate(sql, params),要先把传进的参数转成List
		List<Object> list = new ArrayList<Object>();
		list.add(eid);
		list.add(prejob);
		list.add(nextjob);
		list.add(predept);
		list.add(nextdept);
		list.add(date);
		list.add(pS);
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
	public int rmPTrans(int eid) {
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
		String sql = "delete from ptrans where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(eid);
		
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功删除"+eid+"号合同的信息");
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
	public int updatePTrans(int eid, int prejob, int nextjob, String predept, String nextdept, String date, String pS) {
		int result = 0;
		//先删再插入
		rmPTrans(eid);
		result = addPTrans(eid, prejob, nextjob, predept, nextdept, date,  pS);
		
		return result;
		
	}
	
	/**
	 * 条件更新
	 */
	@Override
	public int updatePTrans(int eid, String col, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update ptrans set "+col+"=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的调动信息
		params.add(eid);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+eid+"号调动的信息");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}

}
