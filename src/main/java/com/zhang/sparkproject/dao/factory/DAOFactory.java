package com.zhang.sparkproject.dao.factory;

import com.zhang.sparkproject.dao.IAdBlacklistDAO;
import com.zhang.sparkproject.dao.IAdClickTrendDAO;
import com.zhang.sparkproject.dao.IAdProvinceTop3DAO;
import com.zhang.sparkproject.dao.IAdStatDAO;
import com.zhang.sparkproject.dao.IAdUserClickCountDAO;
import com.zhang.sparkproject.dao.IAreaTop3ProductDAO;
import com.zhang.sparkproject.dao.IPageSplitConvertRateDAO;
import com.zhang.sparkproject.dao.ISessionAggrStatDAO;
import com.zhang.sparkproject.dao.ISessionDetailDAO;
import com.zhang.sparkproject.dao.ISessionRandomExtractDAO;
import com.zhang.sparkproject.dao.ITaskDAO;
import com.zhang.sparkproject.dao.ITop10CategoryDAO;
import com.zhang.sparkproject.dao.ITop10SessionDAO;
import com.zhang.sparkproject.dao.impl.AdBlacklistDAOImpl;
import com.zhang.sparkproject.dao.impl.AdClickTrendDAOImpl;
import com.zhang.sparkproject.dao.impl.AdProvinceTop3DAOImpl;
import com.zhang.sparkproject.dao.impl.AdStatDAOImpl;
import com.zhang.sparkproject.dao.impl.AdUserClickCountDAOImpl;
import com.zhang.sparkproject.dao.impl.AreaTop3ProductDAOImpl;
import com.zhang.sparkproject.dao.impl.PageSplitConvertRateDAOImpl;
import com.zhang.sparkproject.dao.impl.SessionAggrStatDAOImpl;
import com.zhang.sparkproject.dao.impl.SessionDetailDAOImpl;
import com.zhang.sparkproject.dao.impl.SessionRandomExtractDAOImpl;
import com.zhang.sparkproject.dao.impl.TaskDAOImpl;
import com.zhang.sparkproject.dao.impl.Top10CategoryDAOImpl;
import com.zhang.sparkproject.dao.impl.Top10SessionDAOImpl;

/**
 * DAO工厂类
 * @author Administrator
 *
 */
public class DAOFactory {


	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}

	public static ISessionAggrStatDAO getSessionAggrStatDAO() {
		return new SessionAggrStatDAOImpl();
	}
	
	public static ISessionRandomExtractDAO getSessionRandomExtractDAO() {
		return new SessionRandomExtractDAOImpl();
	}
	
	public static ISessionDetailDAO getSessionDetailDAO() {
		return new SessionDetailDAOImpl();
	}
	
	public static ITop10CategoryDAO getTop10CategoryDAO() {
		return new Top10CategoryDAOImpl();
	}
	
	public static ITop10SessionDAO getTop10SessionDAO() {
		return new Top10SessionDAOImpl();
	}
	
	public static IPageSplitConvertRateDAO getPageSplitConvertRateDAO() {
		return new PageSplitConvertRateDAOImpl();
	}
	
	public static IAreaTop3ProductDAO getAreaTop3ProductDAO() {
		return new AreaTop3ProductDAOImpl();
	}
	
	public static IAdUserClickCountDAO getAdUserClickCountDAO() {
		return new AdUserClickCountDAOImpl();
	}
	
	public static IAdBlacklistDAO getAdBlacklistDAO() {
		return new AdBlacklistDAOImpl();
	}
	
	public static IAdStatDAO getAdStatDAO() {
		return new AdStatDAOImpl();
	}
	
	public static IAdProvinceTop3DAO getAdProvinceTop3DAO() {
		return new AdProvinceTop3DAOImpl();
	}
	
	public static IAdClickTrendDAO getAdClickTrendDAO() {
		return new AdClickTrendDAOImpl();
	}
	
}
