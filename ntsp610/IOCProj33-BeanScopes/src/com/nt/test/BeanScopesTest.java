package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class BeanScopesTest {

	public static void main(String[] args) {
		Resource res=null;
		 DefaultListableBeanFactory factory=null;
		 XmlBeanDefinitionReader reader=null;
		 WishMessageGenerator generator1=null,generator2=null;
		//create IOC container
			factory=new DefaultListableBeanFactory();
			reader=new XmlBeanDefinitionReader(factory);
           reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Target class obj
		generator1=factory.getBean("wmg",WishMessageGenerator.class);
		generator2=factory.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println(generator1.hashCode()+"  "+generator2.hashCode());
		System.out.println("generator1==generator2?"+(generator1==generator2));
		//invoke b.method
		System.out.println("Message:::"+generator1.sayHello("raja"));
	}

}
