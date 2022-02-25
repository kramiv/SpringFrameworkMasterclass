package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	MyMath myMath = new MyMath();
	//order in which tests are run is guaranteed
	//except for before which is first
	
	@After
	public void after() {
		System.out.println("After");
		assertEquals(6, myMath.sum(new int[] {1, 2, 3}));
	}
	
	@Before
	public void before() {
		System.out.println("Before");
		assertEquals(6, myMath.sum(new int[] {1, 2, 3}));
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@Test
	public void sum_with3numbers() {
		int result = (myMath.sum(new int[] {1, 2, 3}));
		assertEquals(6, result);//expected, actual
		System.out.println("Test1");
	}
	
	@Test
	public void sum_with1number() {
		int result = (myMath.sum(new int[] {3}));
		assertEquals(3, result);//expected, actual
		System.out.println("Test2");
	}

}

//absence of fail is success
