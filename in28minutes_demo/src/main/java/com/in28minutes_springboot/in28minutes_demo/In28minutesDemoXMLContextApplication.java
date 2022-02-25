package com.in28minutes_springboot.in28minutes_demo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
//import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes_springboot.in28minutes_demo.basic.BinarySearchImpl;
import com.in28minutes_springboot.in28minutes_demo.xml.XmlPersonDAO;

import ch.qos.logback.classic.Logger;

//note: in application.properties can do logging.level.org.springframework = debug

public class In28minutesDemoXMLContextApplication {

	private static Logger LOGGER = 
			(Logger) LoggerFactory.getLogger(In28minutesDemoScopeApplication.class);
	
	public static void main(String[] args) {
				//AnnotationConfigApplicationContext
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
				//SpringApplication.run(In28minutesDemoBasicApplication.class, args);
		
		LOGGER.info("Beans Loaded -> {}",
				(Object) applicationContext.getBeanDefinitionNames());
		//Beans Loaded -> [xmlJdbcConnection, xmlPersonDAO]
		
		XmlPersonDAO personDao = ((BeanFactory)
				 applicationContext).getBean(XmlPersonDAO.class); 
		System.out.println(personDao);//check for unique vs. the same beans
		System.out.println(personDao.getXmlJdbcConnection());//check for unique vs. the same beans

		LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());
		
		}
		//applicationContext.close();//new
		
	}

}