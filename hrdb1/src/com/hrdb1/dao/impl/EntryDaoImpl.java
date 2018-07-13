package com.hrdb1.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import com.hrdb1.dao.IEntryDao;
import com.hrdb1.entity.Entry;
import com.hrdb1.util.BaseDao;

public class EntryDaoImpl implements IEntryDao {
	
    private BaseDao baseDao;
	
	/**
	 * 查询所有员工信息
	 */

	@Override
	public List<Entry> showEntry() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<Entry> list = new ArrayList<Entry>();
		String sql = "select * from entry";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				Date date = rs.getDate("date");
				Integer jid = rs.getInt("jid");
				String dept = rs.getString("dept");
				
				Entry emp = new Entry(eid, date, jid, dept);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int addEntry(int eid, Date date, int jid, String dept) {
		// TODO Auto-generated method stub
        baseDao = new BaseDao();
		
		//影响行数
		int result = 0;
		String sql = "insert into entry values(?,?,?,?)";	
		
		//调用baseDao的函数执行插入操作
		//用executeUpdate(sql, params),要先把传进的参数转成List
		List<Object> list = new ArrayList<Object>();
		list.add(eid);
		list.add(date);
		list.add(jid);
		list.add(dept);
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
