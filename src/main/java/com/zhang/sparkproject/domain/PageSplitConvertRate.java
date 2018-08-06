package com.zhang.sparkproject.domain;

/**
 * 页面切片转化率
 * @author Administrator
 *
 */
public class PageSplitConvertRate {

	//数据库建表
	private long taskid;
	private String convertRate;
	
	public long getTaskid() {
		return taskid;
	}
	public void setTaskid(long taskid) {
		this.taskid = taskid;
	}
	public String getConvertRate() {
		return convertRate;
	}
	public void setConvertRate(String convertRate) {
		this.convertRate = convertRate;
	}
	
}
