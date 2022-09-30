package com.yash.practice;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class TestClass {
	public static String getAction() {
		String action="";
	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("Please enter URL:");
	    String url = keyboard.next();
	    
	    if(url.equals("www.yash.com/index.jsp")) {
	    	action="index";
	    }else if(url.equals("www.yash.com/employees/salary.xhtml")) {
	    	action ="salary";
	    }else if (url.equals("www.google.com/searches/searchdata.jsp")) {
			action = "searchdata";
	    }

	    return action;
	}
	
	@Test
	public void testGetAction() {
		assertEquals("index",getAction());
	}
	
	@Test
	public void testGetAction1() {
		assertEquals("salary",getAction());
	}
	
	@Test
	public void testGetAction2() {
		assertEquals("searchdata",getAction());
	}
	
}
