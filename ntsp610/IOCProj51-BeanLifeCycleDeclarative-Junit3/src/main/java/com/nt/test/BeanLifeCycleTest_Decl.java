package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.CheckVotingElgibity;

public class BeanLifeCycleTest_Decl {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CheckVotingElgibity elgibility=null;
		// create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println(".....");
		//get Bean
		elgibility=ctx.getBean("voter",CheckVotingElgibity.class);
		elgibility=ctx.getBean("voter",CheckVotingElgibity.class);
		//invoke method
		System.out.println("................");
		System.out.println(elgibility.elgibilityCheck());
		//close container
		System.out.println("....................");
		((AbstractApplicationContext) ctx).close();
	}

}
