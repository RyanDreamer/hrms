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
	 * ��ѯ����Ա����Ϣ
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
		
		//Ӱ������
		int result = 0;
		String sql = "insert into entry values(?,?,?,?)";	
		
		//����baseDao�ĺ���ִ�в������
		//��executeUpdate(sql, params),Ҫ�ȰѴ����Ĳ���ת��List
		List<Object> list = new ArrayList<Object>();
		list.add(eid);
		list.add(date);
		list.add(jid);
		list.add(dept);
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
