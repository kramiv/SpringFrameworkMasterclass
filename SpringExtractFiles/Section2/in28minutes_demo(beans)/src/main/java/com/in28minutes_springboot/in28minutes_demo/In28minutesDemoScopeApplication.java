package com.in28minutes_springboot.in28minutes_demo;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
import org.springframework.beans.factory.BeanFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes_springboot.in28minutes_demo.basic.BinarySearchImpl;
import com.in28minutes_springboot.in28minutes_demo.scope.

PersonDAO;

@Configuration
@ComponentScan
public class In28minutesDemoScopeApplication {

	private static Logger LOGGER = 
			(Logger) LoggerFactory.getLogger(In28minutesDemoScopeApplication.class);
	
	public static void main(String[] args) {
		
		//ConfigurableApplicationContext applicationContext = SpringApplication.run(In28minutesDemoScopeApplication.class, args);
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(In28minutesDemoBasicApplication.class)) {
		
		PersonDAO personDao = ((BeanFactory)
				 applicationContext).getBean(PersonDAO.class); 
		
		PersonDAO personDao2 = ((BeanFactory)
				 applicationContext).getBean(PersonDAO.class); 
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao.getJdbcConnection());

		
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
		}

	}

}