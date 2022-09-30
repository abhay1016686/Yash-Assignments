package com.yash.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringDemoTest {
	String str = "I am a String";
	String str1 = " new string 	";

	@Test
	public void testStringLength() {
		assertEquals(13, str.length());
	}

	@Test
	public void testCharAt() {
		assertEquals('I', str.charAt(0));
	}

	@Test
	public void testConcat() {
		assertEquals("I am a Stringappended", str.concat("appended"));
	}

	@Test
	public void testContains() {
		assertTrue(str.contains("a"));
	}

	@Test
	public void testEndsWith() {
		assertFalse(str.endsWith("abh"));
	}

	@Test
	public void testEquals() {
		assertTrue(str.equals("I am a String"));
	}

	@Test
	public void testEqualsIgnoreCase() {
		assertFalse(str.equalsIgnoreCase("I Am another String"));
	}

	@Test
	public void testIndexOf() {
		assertEquals(3, str.indexOf("m"));
	}

	@Test
	public void testIntern() {
		assertEquals("I am a String", str.intern());
	}

	@Test
	public void testLastIndexOf() {
		assertEquals(5, str.lastIndexOf("a"));
	}

	@Test
	public void testReplace() {
		assertEquals("I bm b String", str.replace("a", "b"));
	}

	@Test
	public void testSplit() {
		assertEquals(4, str.split(" ").length);
	}

	@Test
	public void testSubstring() {
		assertEquals("a String", str.substring(5));
	}

	@Test
	public void testToLowerCase() {
		assertEquals("i am a string", str.toLowerCase());
	}

	@Test
	public void testToUpperCase() {
		assertEquals("I AM A STRING", str.toUpperCase());
	}

	@Test
	public void testTrim() {
		assertEquals("new string", str1.trim());
	}

	@Test
	public void testValueOf() {
		assertEquals("132456", String.valueOf(132456));
	}

}
