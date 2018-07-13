package com.hrdb1.dao.impl;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.hrdb1.dao.IDeptDao;
import com.hrdb1.entity.Dept;
import com.hrdb1.util.BaseDao;

public class DeptDaoImpl implements IDeptDao {
	private BaseDao baseDao;
	
	/**
	 * 查询所有员工信息
	 */

	@Override
	public List<Dept> showDept() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<Dept> list = new ArrayList<Dept>();
		String sql = "select * from dept";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				String name = rs.getString("name");
				Integer minister = rs.getInt("minister");
				String sdept = rs.getString("sdept");
				
				Dept emp = new Dept(name, minister, sdept);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Dept> findEmployee(String col, Object param){
		baseDao = new BaseDao();
		List<Dept> list = new ArrayList<Dept>();
		String sql = "select * from dept where "+col+"=?";
		List<Object> params = new ArrayList<Object>();
		params.add(param);
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				String name = rs.getString("name");
				Integer minister = rs.getInt("minister");
				String sdept = rs.getString("sdept");
				
				Dept emp = new Dept(name, minister, sdept);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public int addDept(String name, int minister, String sdept) {
		// TODO Auto-generated method stub
        baseDao = new BaseDao();
		
		//影响行数
		int result = 0;
		String sql = "insert into dept values(?,?,?)";	
		
		//调用baseDao的函数执行插入操作
		//用executeUpdate(sql, params),要先把传进的参数转成List
		List<Object> list = new ArrayList<Object>();
		list.add(name);
		list.add(minister);
		list.add(sdept);
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
	
	/* (non-Javadoc)删除操作
	 * @see com.hrms.dao.IDeptDao#rmDept(int)
	 */
	@Override
	public int rmDept(String name) {
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
		String sql = "delete from dept where name=?";
		List<Object> params = new ArrayList<Object>();
		params.add(name);
		
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功删除"+name+"号部门的信息");
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
	public int updateDept(String name, int minister, String sdept) {
		int result = 0;
		//先删再插入
		rmDept(name);
		result = addDept(name, minister, sdept );
		
		return result;
		
	}
	
	/**
	 * 条件更新
	 */
	@Override
	public int updateDept(String name, String col, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update dept set "+col+"=? where name=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的员工号
		params.add(name);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+name+"号部门的信息");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}

}
