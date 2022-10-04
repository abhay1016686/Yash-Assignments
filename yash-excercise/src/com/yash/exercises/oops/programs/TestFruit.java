package com.yash.exercises.oops.programs;

public class TestFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calories, Carbohydrate, Fiber, Sugar, Fat, Protein, vitamins 
		String sourFruit[]= {"25% calories","40% carbohydrate","10% fiber" ,"15% sugar", "3% fat" ,"9% protein" ,"12% vit"};
		String sweetFruit[]= {"13% calories","17% carbohydrate","26% fiber" ,"43% sugar", "5% fat" ,"5% protein" ,"10% vit"};
		
		SourFruits sof=new SourFruits("Strawberry", "red", sourFruit, "15%sugar");

		SweetFruits sf=new SweetFruits("Sapota", "coppery brown", sweetFruit, "40%sugar");
		
		sof.display(sof);
		sf.display(sf);
	}

}
