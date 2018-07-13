package com.hrdb1.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
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
				Date date = rs.getDate("date");
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
	public int addPTrans(int eid, int prejob, int nextjob, String predept, String nextdept, Date date, String pS) {
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

}
