package com.yash.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConsicativeAddTest {
	ConsicativeAdd conAdd = new ConsicativeAdd();
	/*
	 * @Test public void testAddUpTo() { fail("Not yet implemented"); }
	 */

	@Test
	public void testAddUpTo() {
		assertEquals(21,conAdd.addUpTo(6));
	}
}	
