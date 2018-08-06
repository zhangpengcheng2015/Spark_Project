package com.zhang.sparkproject.test;

import com.zhang.sparkproject.dao.ITaskDAO;
import com.zhang.sparkproject.dao.factory.DAOFactory;
import com.zhang.sparkproject.domain.Task;

/**
 * 任务管理DAO测试类
 * @author Administrator
 *
 */
public class TaskDAOTest {
	
	public static void main(String[] args) {
		ITaskDAO taskDAO = DAOFactory.getTaskDAO();
		Task task = taskDAO.findById(2);
		System.out.println(task.getTaskName());  
	}
	
}
