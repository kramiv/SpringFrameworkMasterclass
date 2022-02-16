package com.in28minutes_springboot.in28minutes_demo.basic;
import org.springframework.stereotype.Component;//	ctrl-1 to get this code
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

//singleton (reuse bean), prototype (unique bean: @Scope with prototype)
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//or singleton
public class BinarySearchImpl {

	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;//could also do private SortAlgorithm quickSortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);//impl is now using the interface
		//search the array
		
		return 4;
	}


}
//what are the beans?
//what are the dependencies of a bean?
//where to search for beans?