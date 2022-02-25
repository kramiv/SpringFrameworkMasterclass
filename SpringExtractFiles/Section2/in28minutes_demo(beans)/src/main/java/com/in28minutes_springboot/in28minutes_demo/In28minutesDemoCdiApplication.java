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
import com.in28minutes_springboot.in28minutes_demo.cdi.SomeCdiBusiness;
import com.in28minutes_springboot.in28minutes_demo.scope.

PersonDAO;

@Configuration
@ComponentScan
public class In28minutesDemoCdiApplication {

	private static Logger LOGGER = 
			(Logger) LoggerFactory.getLogger(In28minutesDemoCdiApplication.class);
	
	public static void main(String[] args) {
		
		//ConfigurableApplicationContext applicationContext = SpringApplication.run(In28minutesDemoCdiApplication.class, args);
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(In28minutesDemoBasicApplication.class)) {
		
		SomeCdiBusiness business = ((BeanFactory)
				 applicationContext).getBean(SomeCdiBusiness.class); 
		
		LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
		}
	}

}