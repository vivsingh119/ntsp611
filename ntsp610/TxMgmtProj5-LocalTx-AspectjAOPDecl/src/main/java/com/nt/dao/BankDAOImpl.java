package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDAOImpl implements BankDAO {
	private static final String WITHDRAW_QUERY="UPDATE ACCOUNT SET BALANCE=BALANCE-? WHERE ACNO=?";
	private static final String DEPOSITE_QUERY="UPDATE ACCOUNT SET BALANCE=BALANCE+? WHERE ACNO=?";
    private static final String  GET_BALANCE_QUERY="SELECT BALANCE FROM ACCOUNT WHERE ACNO=? ";
	private JdbcTemplate jt;

	public BankDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int widraw(int acno, float amt) {
		int count=0;
		count=jt.update(WITHDRAW_QUERY, amt,acno);
		return count;
	}

	public int deposite(int acno, float amt) {
		int count=0;
		count=jt.update(DEPOSITE_QUERY,amt,acno);
		return count;
	}

	public float getBalnace(int acno) {
		float salary=0.0f;
		salary=jt.queryForObject(GET_BALANCE_QUERY, Float.class,acno);
		return salary;
	}

}
