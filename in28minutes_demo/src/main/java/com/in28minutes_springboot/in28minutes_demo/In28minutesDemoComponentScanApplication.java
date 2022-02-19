package com.in28minutes_springboot.in28minutes_demo;//default @Component scan: everything in this package and below it will be picked up by component scan

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
import org.springframework.beans.factory.BeanFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes_springboot.basics.componentscan.ComponentDAO;
import com.in28minutes_springboot.in28minutes_demo.basic.BinarySearchImpl;
import com.in28minutes_springboot.in28minutes_demo.scope.

PersonDAO;

@Configuration
@ComponentScan
public class In28minutesDemoComponentScanApplication {

	private static Logger LOGGER = 
			(Logger) LoggerFactory.getLogger(In28minutesDemoComponentScanApplication.class);
	
	public static void main(String[] args) {
		
		//ConfigurableApplicationContext applicationContext = SpringApplication.run(In28minutesDemoComponentScanApplication.class, args);
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(In28minutesDemoBasicApplication.class)) {
		
		
		ComponentDAO componentDao = ((BeanFactory)
				 applicationContext).getBean(ComponentDAO.class); 
		
		LOGGER.info("{}", componentDao);

		}
	}

}