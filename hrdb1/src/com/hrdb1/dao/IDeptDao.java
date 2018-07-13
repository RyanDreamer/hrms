package com.hrdb1.dao;
import java.util.List;
import com.hrdb1.entity.Dept;
public interface IDeptDao {
	
	/**
	 * ��ѯ���в�����Ϣ
	 * @param datas
	 * @return
	 */
	public List<Dept> showDept();
	
	public List<Dept> findDept(String col, Object param);
	
	/**
	 * ����һ��������Ϣ
	 * @param name
	 * @param minister
	 * @param sdept
	 * @return
	 */
	public int addDept(String name, int minister, String sdept );
	
	/**
	 * ���ݲ�����ɾ����������
	 * @param name
	 * @return ��Ӱ�������
	 */
	public int rmDept(String name);
	
	/**
	 * ���²��ŵ���Ϣ���ɷ����ģ�Ҳ��ȫ����
	 * @return ��Ӱ�������
	 */
	public int updateDept(String name, int minister, String sdept);
	public int updateDept(String name, String col, String value);
}

