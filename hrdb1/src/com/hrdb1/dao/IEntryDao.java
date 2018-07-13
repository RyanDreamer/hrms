package com.hrdb1.dao;

import java.util.List;
import com.hrdb1.entity.Entry;

public interface IEntryDao {
	/**
	 * ��ѯ������ְ��Ϣ
	 * @param datas
	 * @return
	 */
	
public List<Entry> showEntry();

public List<Entry> findEntry(String col, String param);
	
	/**
	 * ����һ����ְ��Ϣ
	 * @param eid
	 * @param date
	 * @param jid
	 * @param dept
	 * @return
	 */
	
	public int addEntry(int eid,String date, int jid, String dept );
	
	/**
	 * ���ݲ�����ɾ����������
	 * @param name
	 * @return ��Ӱ�������
	 */
	public int rmEntry(int eid);
	
	/**
	 * ���²��ŵ���Ϣ���ɷ����ģ�Ҳ��ȫ����
	 * @return ��Ӱ�������
	 */
	public int updateEntry(int eid,String date, int jid, String dept);
	
	public int updateEntry(int eid, String col, String value);
	

}
