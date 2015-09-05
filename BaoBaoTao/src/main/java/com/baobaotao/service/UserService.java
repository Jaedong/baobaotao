package com.baobaotao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.dao.UserDao;
import com.baobaotao.domain.LoginLog;
import com.baobaotao.domain.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private LoginLogDao loginLogDao;
	
	public boolean hasMatchUser(String userName,String passowrd){
		int matchCount = userDao.getMatchCount(userName, passowrd);
		return matchCount > 0;
	}
	
	public User findUserByUserName(String userName){
		return userDao.findUserByUserName(userName);
	}
	
	public void loginSuccess(User user){
		user.setCreadits(5 + user.getCreadits());
		LoginLog loginLog = new LoginLog();
		loginLog.setUserId(user.getUserId());
		loginLog.setIp(user.getLastIp());
		loginLog.setLoginDate(user.getLastVisit());
		userDao.udateLoginInfo(user);
		loginLogDao.insertLoginLog(loginLog);
		
	}
}
