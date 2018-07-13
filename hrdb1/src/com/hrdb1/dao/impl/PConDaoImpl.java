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
	 * ��ѯ����Ա����Ϣ
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
		
		//Ӱ������
		int result = 0;
		String sql = "insert into PCon values(?,?,?,?,?,?)";	
		
		//����baseDao�ĺ���ִ�в������
		//��executeUpdate(sql, params),Ҫ�ȰѴ����Ĳ���ת��List
		List<Object> list = new ArrayList<Object>();
		list.add(id);
		list.add(salary);
		list.add(startdate);
		list.add(deadline);
		list.add(eid);
		list.add(jid);
		result = baseDao.executeUpdate(sql, list);
		
		//��ӡ�����Ϣ
		if (result != 0) {
			System.out.println("�ɹ����룬Ӱ����"+result+"�У���ϲ");
		}
		else {
			System.out.println("Sorry,ʧ����");
		}
		
		return result;
	}

}
