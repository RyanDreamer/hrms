package com.hrdb1.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.hrdb1.dao.IEmployeeInfoDao;
import com.hrdb1.entity.EmployeeInfo;
import com.hrdb1.util.BaseDao;

public class EmployeeInfoDaoImpl implements IEmployeeInfoDao {
	private BaseDao baseDao;
	
	/**
	 * 查询所有员工信息
	 */
	@Override
	public List<EmployeeInfo> showEmployeeInfo() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from employeeInfo";
		List<Object> params = null;
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				String name = rs.getString("name");
				Integer age = rs.getInt("age");
				String sex = rs.getString("sex");
				String hometown = rs.getString("hometown");
				String oldJob = rs.getString("oldJob");
				Integer experience = rs.getInt("experience");
				String education = rs.getString("education");
				String cet4 = rs.getString("cet4");
				Integer family = rs.getInt("family");
				
				EmployeeInfo emp = new EmployeeInfo(eid, name, age, sex, hometown, oldJob, experience, education, cet4, family);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.hrms.dao.IEmployeeInfoDao#addEmployee(java.util.List)
	 */
	@Override
	public List<EmployeeInfo> findEmployeeInfo(String col, Object param){
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from employeeInfo where "+col+"=?";
		List<Object> params = new ArrayList<Object>();
		params.add(param);
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer eid = rs.getInt("eid");
				String name  = rs.getString("name");
				Integer age = rs.getInt("age");
				String sex  = rs.getString("sex");
				String hometown = rs.getString("hometown");
				String oldJob  = rs.getString("oldJob");
				Integer experience  = rs.getInt("experience");
				String education  = rs.getString("education");
				String cet4   = rs.getString("cet4");
				Integer family   = rs.getInt("family");
				
				EmployeeInfo emp = new EmployeeInfo(eid, name, age, sex, hometown, oldJob, experience, education, cet4, family);
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	
	@Override
	public int addEmployeeInfo(int eid, String name, int age, String sex, String hometown, String oldJob, int experience, String education, String cet4, int family ) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		
		//影响行数
		int result = 0;
		String sql = "insert into employeeInfo values(?,?,?,?,?,?,?,?,?,?)";	
		
		//调用baseDao的函数执行插入操作
		//用executeUpdate(sql, params),要先把传进的参数转成List
		List<Object> list = new ArrayList<Object>();
		list.add(eid);
		list.add(name);
		list.add(age);
		list.add(sex);
		list.add(hometown);
		list.add(oldJob);
		list.add(experience);
		list.add(education);
		list.add(cet4);
		list.add(family);
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
	public int rmEmployeeInfo(int eid) {
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
		String sql = "delete from employeeInfo where eid=?";
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
	public int updateEmployeeInfo(int eid, String name, int age, String sex, String hometowm, String oldjob, int experience,
			String education, String cet4, int family) {
		int result = 0;
		//先删再插入
		rmEmployeeInfo(eid);
		result = addEmployeeInfo(eid, name, age, sex, hometowm, oldjob, experience,
			 education, cet4, family);	
		return result;
		
	}
	
	/**
	 * 条件更新
	 */
	@Override
	public int updateEmployeeInfo(int eid, String col, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update employeeInfo set "+col+"=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的员工 
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