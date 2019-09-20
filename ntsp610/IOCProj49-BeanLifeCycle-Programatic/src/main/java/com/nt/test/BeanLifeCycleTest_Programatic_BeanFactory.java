package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.CheckVotingElgibity;

public class BeanLifeCycleTest_Programatic_BeanFactory {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		CheckVotingElgibity elgibility=null;
		// create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean
		elgibility=factory.getBean("voter",CheckVotingElgibity.class);
		//invoke method
		System.out.println("................");
		System.out.println(elgibility.elgibilityCheck());
		//close container
		System.out.println("....................");
		factory.destroySingletons();
	}

}
