package com.nt.beans;

import java.util.Date;

public class CheckVotingElgibity {
	private String name;
	private int age;
	private String addrs;
	private Date checkingDate;
	
	public CheckVotingElgibity() {
		System.out.println("CheckVotingElgibilit::0-param constructor");
	}

	public void setName(String name) {
		System.out.println("setName(-)");
		this.name = name;
	}

	public void setAge(int age) {
		System.out.println("setAge(-)");
		this.age = age;
	}

	public void setAddrs(String addrs) {
		System.out.println("setAddrs(-)");
		this.addrs = addrs;
	}
	
	public void myInit() {
		System.out.println("CheckVotingElgibity.myInit()");
		checkingDate=new Date();
		if(name==null || age<=0)
			throw new IllegalArgumentException("Invalid inputs");
		
	}
	
	public   String  elgibilityCheck() {
		System.out.println("elgibilityCheck() method");
		if(age<18)
			return "Mr/Miss. "+name+" u  r not elgible for voting as on "+checkingDate;
		else
			return "Mr/Miss/Mrs."+name+" u  r  elgible for voting as on "+checkingDate;
	}
	
	public void myDestroy() {
		System.out.println("CheckVotingElgibity.myDestroy()");
		name=null;
		age=0;
		addrs=null;
		checkingDate=null;
	}
	

}
