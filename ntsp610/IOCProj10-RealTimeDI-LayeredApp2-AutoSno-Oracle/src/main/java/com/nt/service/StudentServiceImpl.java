package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private  StudentDAO dao;

	public StudentServiceImpl() {
		System.out.println("StudentServiceImpl.StudentServiceImpl(-)");
	}
	
	public void setDao(StudentDAO dao) {
		System.out.println("StudentServiceImpl.setDao(-)");
		this.dao = dao;
	}

	@Override
	public String evaluateResult(StudentDTO dto) throws Exception {
		System.out.println("StudentServiceImpl.evaluateResult(-)");
		int total=0;
		float avg=0.0f;
		String result=null;
		StudentBO bo=null;
		int  count=0;
		//write b.logic
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3.0f;
		 if(dto.getM1()<35 || dto.getM2()<35 || dto.getM3()<35)
			 result="fail";
		 else
			 result="pass";
		 //create BO class obj having persistable data
		 bo=new StudentBO();
		 bo.setSname(dto.getSname());
		 bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		//use DAO
		count=dao.insert(bo);
		 if(count==0)
			 return "Student Registration failed :: result is -->"+result;
		 else
			 return " Student Registration succeded :: result is -->"+result;
	}

}
