package com.zhang.sparkproject.dao;

import com.zhang.sparkproject.domain.SessionAggrStat;

/**
 * session聚合统计模块DAO接口
 * @author Administrator
 *
 */
public interface ISessionAggrStatDAO {

	/**
	 * 插入session聚合统计结果
	 * @param sessionAggrStat 
	 */
	void insert(SessionAggrStat sessionAggrStat);
	
}
