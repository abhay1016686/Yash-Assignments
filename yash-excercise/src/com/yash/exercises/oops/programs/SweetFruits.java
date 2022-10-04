package com.yash.exercises.oops.programs;

public class SweetFruits extends Fruit{
	String[] fruitInfo=	new String[9];
	String sweet;
	public SweetFruits(String fruitName, String fruitColor, String[] fruitInfo, String sweet) {
		super(fruitName, fruitColor);
		this.fruitInfo = fruitInfo;
		this.sweet = sweet;
	}
	public void display(SweetFruits sf)
	{
		System.out.println("****** SweetFruits Details *****");
		System.out.println("Fruit Name ="+sf.fruitName);
		System.out.println("Fruit Color ="+sf.fruitColor);
		System.out.println("Nutrition summary");
		       for(String str:sf.fruitInfo)
		       {
		    	   System.out.print(str +" \n");
		       }
		System.out.println();
		System.out.println("SweetFruit bcz of sugar is =" +sf.sweet);
		
	}
	
}
