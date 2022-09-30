package com.yash.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibSeriesTest {
	FibSeries series= new FibSeries();
	
	
	@Test
	public void testFibonacciSeries() {
		assertEquals("0 1 1 2 3 5",series.fibonacciSeries(6));
	}
	

}
	