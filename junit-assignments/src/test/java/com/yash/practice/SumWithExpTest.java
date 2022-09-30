package com.yash.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumWithExpTest {
	SumWithExp sumWithExp = new SumWithExp();
	@Test
	public void testGetSum() {
		assertEquals(21,sumWithExp.getSum("6+8+7"));
	}

	@Test
	public void testGetSum1() {
		assertEquals(21,sumWithExp.getSum("6/8*7"));
	}
}
