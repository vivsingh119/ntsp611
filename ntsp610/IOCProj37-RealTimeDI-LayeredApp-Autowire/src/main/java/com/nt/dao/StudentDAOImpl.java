package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String  INSERT_LAYERED_STUDENT_QUERY="INSERT INTO SPRING_LAYERED_STUDENT VALUES(?,?,?,?,?)";
	private DataSource ds;
	
	public StudentDAOImpl(DataSource ds) {
	  System.out.println("StudentDAOImpl:1-param constructor");
		this.ds = ds;
	}


	@Override
	public int insert(StudentBO bo) throws Exception {
		System.out.println("StudentDAOImpl.insert(-)");
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		//get Pooled JDBC con object
		con=ds.getConnection();
		//create PreparedStatement obj
		ps=con.prepareStatement(INSERT_LAYERED_STUDENT_QUERY);
		//set values BO class obj data to Query IN params(?)
		ps.setInt(1,bo.getSno());
		ps.setString(2,bo.getSname());
		ps.setInt(3,bo.getTotal());
		ps.setFloat(4,bo.getAvg());
		ps.setString(5,bo.getResult());
		//execute the Query
		result=ps.executeUpdate();
		//close jdbc objs
		ps.close();
		con.close();
		return result;
	}//insert(-)
}//class
