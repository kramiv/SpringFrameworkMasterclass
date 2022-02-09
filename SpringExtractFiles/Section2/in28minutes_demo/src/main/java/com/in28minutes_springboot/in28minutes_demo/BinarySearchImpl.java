package com.in28minutes_springboot.in28minutes_demo;

public class BinarySearchImpl {
	
	//What if I wanted to use quicksort? (algorithm)
	//first, create another class. 
	//keep in mind: how can I separate the two algorithms and make them loosely coupled?
	
	//search for the algorithms dynamically using interface SortAlgorithm:
	private SortAlgorithm sortAlgorithm;//this is an instance: it must be made private
	//now, create a constructor for this (right click --> source --> generate constructor using fields)
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//first, sort the array. Binary search requires a sorted array.
		//next, search the array. 
		//next, return the result (which is typically the index)
		
		//note: this method uses bubble sort. What if I wanted to use quicksort?
		//created a separate class for BubbleSortAlgorithm. 
		//below, I am creating it.
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();//	bubble search
		//int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);//	sorting logic
		//now, bubblesortalgorithm can be changed dynamically
		
		//above, BubbleSort is replaced with SortAlgorithm:
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);//impl is now using the interface
		//search the array
		
		return 3;
	}
	//note: to first run the two classes and check that they call each other correctly
	//in the loosely coupled method/class calls, this method had just "return 3;". 
	//then, when the main class was ran, the output in console was 3
	
	
}
