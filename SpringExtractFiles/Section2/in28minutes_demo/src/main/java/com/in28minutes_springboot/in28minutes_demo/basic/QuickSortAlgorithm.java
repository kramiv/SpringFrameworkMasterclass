package com.in28minutes_springboot.in28minutes_demo.basic;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

@Component
//@Primary  see step 12 + 13 Udemy videos
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		//logic for QuickSort
		return numbers;
	}
	
}