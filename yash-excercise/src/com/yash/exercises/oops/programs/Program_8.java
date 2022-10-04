package com.yash.exercises.oops.programs;

public class Program_8 {

	@Override
	protected void finalize() {
		System.out.println("Finalize called");
	
	}
	public static void main(String[] args) {
		Program_8 obj = new Program_8();   
	        System.out.println(obj.hashCode());   
	        obj = null;   
	            
	        System.gc();   
	        System.out.println("end of garbage collection");   
	}

}
