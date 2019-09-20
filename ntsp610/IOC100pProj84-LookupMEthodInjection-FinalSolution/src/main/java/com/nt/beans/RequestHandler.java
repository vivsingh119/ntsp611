package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("rh")
public class RequestHandler {
	private static int count;

	public RequestHandler() {
		count++;
		System.out.println("RequestHandler:: 0-param constructor"+count);
	}
	
	public  void handleRequest(String data) {
		System.out.println("Handling rquest with data::"+data);
	}

}
