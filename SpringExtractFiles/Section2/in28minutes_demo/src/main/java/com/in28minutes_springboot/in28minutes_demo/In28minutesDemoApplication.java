package com.in28minutes_springboot.in28minutes_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class In28minutesDemoApplication {

	public static void main(String[] args) {
		//to use BinarySearchImpl, create an instance of it:
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//I can call BubbleSortAlgorithm() dynamically
		
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);//number array with number to search for, 3
		System.out.println(result);
		//com.in28minutes_springboot.in28minutes_demo.BubbleSortAlgorithm@15db9742
		
		
		
		//SpringApplication.run(In28minutesDemoApplication.class, args);
	}

}

//overall summary: if I want to use a different algorithm, all I have to do is change 
//the function call inside of "...new BinarySearchImpl();"
//the algorithms are both dependencies of the BinarySearchImpl. Binary Search relies on these algorithms
//important concepts: dependency injections and loose coupling

