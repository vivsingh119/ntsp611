package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserBO;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {
	private static final String   AUTH_QUERY="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?";
	@Autowired
	private  JdbcTemplate jt;

	@Override
	public int authenticate(UserBO bo) {
		int  count=0;
		count=jt.queryForObject(AUTH_QUERY,Integer.class,bo.getUser(),bo.getPwd());
		return count;
	}

}
