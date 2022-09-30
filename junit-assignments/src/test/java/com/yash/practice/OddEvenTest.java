package com.yash.practice;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OddEvenTest {
	OddEven oddeven= new OddEven();
	@Test
	public void testCountEvenOdd() {
		assertEquals("Even count : 2",oddeven.countEvenOdd(66));
	}

}
