package com.in28minutes_springboot.in28minutes_demo;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes_springboot.in28minutes_demo.basic.BinarySearchImpl;
import com.in28minutes_springboot.in28minutes_demo.properties.SomeExternalService;

//note: in application.properties can do logging.level.org.springframework = debug

@Configuration
@ComponentScan("com.in28minutes_springboot.in28minutes_demo")
//app.properties
@PropertySource("classpath:app.properties")
public class In28minutesDemoPropertiesApplication {

	public static void main(String[] args) {
		
		//AnnotationConfigApplicationContext
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(In28minutesDemoPropertiesApplication.class)) {
				//SpringApplication.run(In28minutesDemoBasicApplication.class, args);
		
		SomeExternalService service = ((BeanFactory)
				 applicationContext).getBean(SomeExternalService.class); 
		
		System.out.println(service.returnServiceURL());
		
		}
		//applicationContext.close();//new
		
	}

}