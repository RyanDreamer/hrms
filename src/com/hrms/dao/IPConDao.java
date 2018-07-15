package com.hrms.dao;

import java.util.List;
import com.hrms.entity.PCon;

public interface IPConDao {
	
	/**
	 * ��ѯ��������Ա����Ϣ
	 * @param datas
	 * @return
	 */
	
public List<PCon> showPCon();

public List<PCon> findPCon(String col, String param);
	
	/**
	 * ����һ������Ա����Ϣ
	 * @param id
	 * @param salary
	 * @param startdate
	 * @param deadline
	 * @param eid
	 * @param jid
	 * @return
	 */
	
	public int addPCon(int id, int salary, String startdate, String deadline, int eid, int jid);
	
	/**
	 * ���ݺ�ͬ���ɾ����������
	 * @param name
	 * @return ��Ӱ�������
	 */
	public int rmPCon(int id);
	
	/**
	 * ��������Ա������Ϣ���ɷ����ģ�Ҳ��ȫ����
	 * @return ��Ӱ�������
	 */
	public int updatePCon(int id, int salary, String startdate, String deadline, int eid, int jid);
	
	public int updatePCon(int id, String col, String value);

}
