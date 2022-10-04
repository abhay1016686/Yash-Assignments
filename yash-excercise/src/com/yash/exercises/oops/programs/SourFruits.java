package com.yash.exercises.oops.programs;

public class SourFruits extends Fruit {
	String[] fruitInfo = new String[9];
	String sourt;

	public SourFruits(String fruitname, String fruitcolor, String[] fruitinfo, String sourtest) {
		super(fruitname, fruitcolor);
		this.fruitInfo = fruitinfo;
		this.sourt = sourtest;
	}

	public void display(SourFruits sf)
	{
		System.out.println("***** SourFruits Details** ***");
		System.out.println("Fruit Name ="+sf.fruitName);
		System.out.println("Fruit Color ="+sf.fruitColor);
		System.out.println("**Nutrition summary**");
		       for(String s:sf.fruitInfo)
		       {
		    	   System.out.print(s +" \n");
		       }
		
		System.out.println("It has "+sf.sourt+" sugar so it is SourFruit");
		System.out.println("=============****=============");
	}
}
