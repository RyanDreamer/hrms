package com.hrdb1.dao.impl;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.hrdb1.dao.IDimissionDao;
import com.hrdb1.entity.Dimission;
import com.hrdb1.util.BaseDao;

public class DimissionDaoImpl implements IDimissionDao {
	
    private BaseDao baseDao;
	
	/**
	 * 查询所有员工信息
	 */

	@Override
	public List<Dimission> showDimission() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<Dimission> list = new ArrayList<Dimission>();
		String sql = "select * from dimission";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				String date = rs.getString("date");
				Integer jid = rs.getInt("jid");
				String reason = rs.getString("reason");
				
				Dimission emp = new Dimission(eid, date, jid, reason);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Dimission> findDimission(String col, String param){
		baseDao = new BaseDao();
		List<Dimission> list = new ArrayList<Dimission>();
		String sql = "select * from dimission where "+col+"=?";
		List<Object> params = new ArrayList<Object>();
		params.add(param);
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				String date = rs.getString("date");
				Integer jid = rs.getInt("jid");
				String reason = rs.getString("reason");
				
				Dimission emp = new Dimission(eid, date, jid, reason);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public int addDimission(int eid, String date, int jid, String reason) {
		// TODO Auto-generated method stub
        baseDao = new BaseDao();
		
		//影响行数
		int result = 0;
		String sql = "insert into dimission values(?,?,?,?)";	
		
		//调用baseDao的函数执行插入操作
		//用executeUpdate(sql, params),要先把传进的参数转成List
		List<Object> list = new ArrayList<Object>();
		list.add(eid);
		list.add(date);
		list.add(jid);
		list.add(reason);
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
	public int rmDimission(int eid) {
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
		String sql = "delete from dimission where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(eid);
		
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功删除"+eid+"号离职的信息");
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
	public int updateDimission(int eid,String date, int jid, String reason) {
		int result = 0;
		//先删再插入
		rmDimission(eid);
		result = addDimission(eid, date, jid, reason);	
		return result;
		
	}
	
	/**
	 * 条件更新
	 */
	@Override
	public int updateDimission(int eid, String col, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update dimission set "+col+"=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的部门名
		params.add(eid);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+eid+"号离职的信息");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}

}
