package com.hrdb1.dao;
import java.sql.Date;
import java.util.List;
import com.hrdb1.entity.Dimission;

public interface IDimissionDao {
	
	/**
	 * ��ѯ����Ա����Ϣ
	 * @param datas
	 * @return
	 */
	public List<Dimission> showDimission();
	
	/**
	 * ����һ��Ա����Ϣ
	 * @param eid
	 * @param date
	 * @param jid
	 * @param reason
	 * @return
	 */
	
	public int addDimission(int eid,Date date, int jid, String reason );
}
