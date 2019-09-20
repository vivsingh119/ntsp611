package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Robot;

public class AnnoRequiredTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Robot robo=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean obj
		robo=ctx.getBean("robot",Robot.class);
		System.out.println(robo);
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
