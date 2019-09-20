package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class BeanManagementTest {

	public static void main(String[] args) {
		System.out.println("stat of main(-) method");
		Resource res=null;
		BeanFactory factory=null;
		Date d=null;
		WishMessageGenerator generator=null;
		//Locate and hold Spring Bean cfg file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC Container
		factory=new XmlBeanFactory(res);
		//get Bean objs from IOC container
		/*d=(Date)factory.getBean("dt");
		System.out.println("d obj data:::"+d);
		System.out.println("..........................................");
		*/generator=(WishMessageGenerator)factory.getBean("wmg");
		  factory.getBean("wmg");
		  factory.getBean("wmg");
		  factory.getBean("wmg");
		System.out.println("Wish message::"+generator.sayHello("raja"));
		
		System.out.println("end of main(-) method");
	}//main
}//class
