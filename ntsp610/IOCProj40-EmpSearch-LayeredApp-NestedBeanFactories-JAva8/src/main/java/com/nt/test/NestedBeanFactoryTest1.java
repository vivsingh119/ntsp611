package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class NestedBeanFactoryTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory pFactory=null,cFactory=null;
		XmlBeanDefinitionReader reader1=null,reader2=null;
		MainController controller=null;
		List<EmployeeVO> listVO=null;
		//create Parent Container
		pFactory=new DefaultListableBeanFactory();
		reader1=new XmlBeanDefinitionReader(pFactory);
		reader1.loadBeanDefinitions("com/nt/cfgs/business-beans.xml");
		
		//create Child Container
		cFactory=new DefaultListableBeanFactory(pFactory);
		reader2=new XmlBeanDefinitionReader(cFactory);
		reader2.loadBeanDefinitions("com/nt/cfgs/presentation-beans.xml");
		//get Controller
		controller=cFactory.getBean("controller",MainController.class);
		//invoke methods
		try {
			listVO=controller.getEmpsByDesg("CLERK");
			//display results
			listVO.forEach(vo->{
				System.out.println(vo);
			});
		}
		catch(Exception e) {
			System.out.println("Internal Problem::"+e.getMessage());
		}
		

	}//main
}//class
