package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.PropertyEditorRegistrySupport;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankService;
import com.nt.beans.IntrestAmountDetails;
import com.nt.pe.IntrAmountDetailsEditor;

public class CustomPETestBF2 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		BankService service=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//add Registrar with  IOContainer
		factory.addPropertyEditorRegistrar(registry->{
			 registry.registerCustomEditor(IntrestAmountDetails.class,
					                                                   new IntrAmountDetailsEditor());
		});
		//get Bean
		service=factory.getBean("bankService",BankService.class);
		//invoke method
		System.out.println("Intr Amount::"+service.calcIntrAmount());
	}//main
	
}//class
