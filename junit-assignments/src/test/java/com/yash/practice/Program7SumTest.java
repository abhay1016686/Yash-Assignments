package com.yash.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class Program7SumTest {
	Program7Sum prog7 = new Program7Sum();
	@Test
	public void testGetSum() {
		assertEquals(2107,prog7.getSum());
	}

}
