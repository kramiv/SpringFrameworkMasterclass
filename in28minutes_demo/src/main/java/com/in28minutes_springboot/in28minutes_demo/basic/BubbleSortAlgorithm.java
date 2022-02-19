package com.in28minutes_springboot.in28minutes_demo.basic;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		//logic for Bubble sort
		return numbers;
	}
	
}
