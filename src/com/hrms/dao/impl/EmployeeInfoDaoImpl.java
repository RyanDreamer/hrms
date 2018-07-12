package com.hrms.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hrms.dao.IEmployeeInfoDao;
import com.hrms.entity.EmployeeInfo;
import com.hrms.util.BaseDao;

public class EmployeeInfoDaoImpl implements IEmployeeInfoDao {
	private BaseDao baseDao;
	
	/**
	 * 查询所有员工信息
	 */
	@Override
	public List<EmployeeInfo> showEmployee() {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from EmployeeInfo";
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
	public int addEmployee(int eid, String name, int age, String sex, String hometown, String oldJob, int experience, String education, String cet4, int family ) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		
		//影响行数
		int result = 0;
		String sql = "insert into EmployeeInfo values(?,?,?,?,?,?,?,?,?,?)";	
		
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

	/* (non-Javadoc)
	 * @see com.hrms.dao.IEmployeeInfoDao#rmEmployee(int)
	 */
	@Override
	public int rmEmployee(int eid) {
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
		String sql = "delete from EmployeeInfo where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(eid);
		
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功删除"+eid+"号员工的信息");
		}
		else {
			System.out.println("没能成功删除");
		}
		
		return result;
	}

	/**
	 * 
	 */
	@Override
	public int updateEmployee(int eid, String name, int age
			, String sex, String hometown, String oldJob
			, int experience, String education, String cet4, int family) {
		int result = 0;
		//先删再插入
		rmEmployee(eid);
		result = addEmployee(eid, name, age, sex, hometown
				, oldJob, experience, education, cet4, family);
		
		return result;
		
	}
	public int updateName(int eid, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update EmployeeInfo set name=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的员工号
		params.add(eid);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+eid+"号员工的姓名");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}
	public int updateAge(int eid, Integer value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update EmployeeInfo set age=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的员工号
		params.add(eid);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+eid+"号员工的年龄");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}
	public int updateSex(int eid, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update EmployeeInfo set Sex=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的员工号
		params.add(eid);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+eid+"号员工的性别");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}
	public int updateHometown(int eid, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update EmployeeInfo set hometown=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的员工号
		params.add(eid);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+eid+"号员工的籍贯");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}
	public int updateOldJob(int eid, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update EmployeeInfo set oldJob=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的员工号
		params.add(eid);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+eid+"号员工的旧职业");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}
	public int updateExperience(int eid, Integer value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update EmployeeInfo set experience=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的员工号
		params.add(eid);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+eid+"号员工的工作年数");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}
	public int updateEducation(int eid, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update EmployeeInfo set education=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的员工号
		params.add(eid);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+eid+"号员工的学历");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}
	public int updateCet4(int eid, String value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update EmployeeInfo set cet4=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的员工号
		params.add(eid);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+eid+"号员工的英语能力");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}
	public int updateFamily(int eid, Integer value) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		//受影响的行数
		int result = 0;
		String sql = "update EmployeeInfo set family=? where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(value);
		//确定要修改的员工号
		params.add(eid);
		//执行
		result = baseDao.executeUpdate(sql, params);
		if (result != 0) {
			System.out.println("成功更新"+eid+"号员工的家庭成员人数");
		}
		else {
			System.out.println("没能成功更新");
		}
		return result;
	}
	
	//条件查找员工
	public List<EmployeeInfo> findEmployeeByEid(int eidv){
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from EmployeeInfo where eid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(eidv);
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
	public List<EmployeeInfo> findEmployeeByName(String namev){
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from EmployeeInfo where name=?";
		List<Object> params = new ArrayList<Object>();
		params.add(namev);
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
	public List<EmployeeInfo> findEmployeeByAge(int agev){
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from EmployeeInfo where age=?";
		List<Object> params = new ArrayList<Object>();
		params.add(agev);
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
	public List<EmployeeInfo> findEmployeeBySex(String sexv){
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from EmployeeInfo where sex=?";
		List<Object> params = new ArrayList<Object>();
		params.add(sexv);
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
	public List<EmployeeInfo> findEmployeeByHometown(String hometownv){
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from EmployeeInfo where hometown=?";
		List<Object> params = new ArrayList<Object>();
		params.add(hometownv);
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
	public List<EmployeeInfo> findEmployeeByOldJob(String oldJobv){
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from EmployeeInfo where oldJob=?";
		List<Object> params = new ArrayList<Object>();
		params.add(oldJobv);
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
	public List<EmployeeInfo> findEmployeeByExperience(int experiencev){
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from EmployeeInfo where experience=?";
		List<Object> params = new ArrayList<Object>();
		params.add(experiencev);
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
	public List<EmployeeInfo> findEmployeeByEducation(String educationv){
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from EmployeeInfo where education=?";
		List<Object> params = new ArrayList<Object>();
		params.add(educationv);
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
	public List<EmployeeInfo> findEmployeeByCet4(String cet4v){
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from EmployeeInfo where cet4=?";
		List<Object> params = new ArrayList<Object>();
		params.add(cet4v);
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
	public List<EmployeeInfo> findEmployeeByFamily(String familyv){
		baseDao = new BaseDao();
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		String sql = "select * from EmployeeInfo where family=?";
		List<Object> params = new ArrayList<Object>();
		params.add(familyv);
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
	
	

}
