package com.in28minutes_springboot.in28minutes_demo.basic;

import org.springframework.stereotype.Component;//	ctrl-1 to get this code
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

//singleton (reuse bean), prototype (unique bean: @Scope with prototype)
@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)//or singleton
public class BinarySearchImpl {

	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;//could also do private SortAlgorithm quickSortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);//impl is now using the interface
		//search the array
		
		return 4;
	}

	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {//@postConstruct allows content of beans to be initialized as soon as beans become available
		logger.info("preDestroy");//@PreDestroy is the opposite. note: change method name to match
	}

}
//what are the beans?
//what are the dependencies of a bean?
//where to search for beans?