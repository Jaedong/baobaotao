package com.baobaotao.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.LoginLog;

@Repository
public class LoginLogDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertLoginLog(LoginLog loginLog){
		String sqlStr = "insert into t_login_log(user_id,ip,login_datetime) "
				+" values(?,?,?)";
		jdbcTemplate.update(sqlStr, new Object[]{
				loginLog.getUserId(),loginLog.getIp(),loginLog.getLoginDate()
		});
	}
	
	public int findLoginLogByUserName(String userName){
		String sqlStr = "select count(*) from t_login_log where user_name = ?";
		return jdbcTemplate.queryForInt(sqlStr);
				
	}
}
