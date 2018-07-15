package com.hrms.dao;

import java.util.List;
import com.hrms.entity.Dimission;

public interface IDimissionDao {
	
	/**
	 * ��ѯ������ְ��Ϣ
	 * @param datas
	 * @return
	 */
	public List<Dimission> showDimission();
	
	public List<Dimission> findDimission(String col, String param);
	
	/**
	 * ����һ����ְ��Ϣ
	 * @param eid
	 * @param date
	 * @param jid
	 * @param reason
	 * @return
	 */
	
	public int addDimission(int eid,String date, int jid, String reason );
	
	/**
	 * ���ݲ�����ɾ����ְ����
	 * @param name
	 * @return ��Ӱ�������
	 */
	public int rmDimission(int eid);
	
	/**
	 * ������ְ����Ϣ���ɷ����ģ�Ҳ��ȫ����
	 * @return ��Ӱ�������
	 */
	public int updateDimission(int eid,String date, int jid, String reason);
	
	public int updateDimission(int eid, String col, String value);
}