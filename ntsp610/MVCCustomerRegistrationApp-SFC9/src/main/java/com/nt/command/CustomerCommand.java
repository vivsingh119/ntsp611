package com.nt.command;

import lombok.Data;

@Data
public class CustomerCommand {
	private  String cname;
	private  String cadd="hyd";
	private Long  mobileNo;
	private Float  billAmt;
	
	public CustomerCommand() {
		System.out.println("CustomerCommand::0-param constructor");
	}

}
