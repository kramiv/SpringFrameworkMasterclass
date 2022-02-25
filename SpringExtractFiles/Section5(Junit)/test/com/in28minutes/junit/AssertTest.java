package com.in28minutes.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class AssertTest {
	@Test
	public void test() {
		boolean condition = true;
		assertTrue(condition);
		assertEquals(true, true);
		//assertFalse(condition);
		//assertNotNull(condition);
		//assertNull(condition);
		//assertNotEquals();
		int[] array1 = {1,2,3};
		int[] array2 = {1,2,3};
		assertArrayEquals(array1, array2);
		//order matters in arrays
	}

}
