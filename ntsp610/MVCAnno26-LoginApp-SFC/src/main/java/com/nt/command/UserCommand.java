package com.nt.command;

import lombok.Data;

@Data
public class UserCommand {
	private String user;
	private String pwd;
	public UserCommand() {
		System.out.println("UserCommand::0-param construtor");
	}

}
