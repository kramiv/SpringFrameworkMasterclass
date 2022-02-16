package com.in28minutes_springboot.in28minutes_demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes_springboot.in28minutes_demo.basic.BinarySearchImpl;

//note: in application.properties can do logging.level.org.springframework = debug

@SpringBootApplication
public class In28minutesDemoBasicApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(In28minutesDemoBasicApplication.class, args);
		BinarySearchImpl binarySearch = ((BeanFactory)
				 applicationContext).getBean(BinarySearchImpl.class); 
		
		BinarySearchImpl binarySearch2 = ((BeanFactory)
				 applicationContext).getBean(BinarySearchImpl.class); 
		
		System.out.println(binarySearch);//check for unique vs. the same beans
		System.out.println(binarySearch2);
		
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
		
	}

}