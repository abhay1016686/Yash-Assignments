package com.yash.practice;

public class Program7Sum {
	int getSum() {

		int sum = 0;

		for (int n = 100; n <= 200; n++) {
			if(n%7==0) {
				sum +=  n;
			}
			
		}
		

		return sum;
	}

	// Driver code

	public static void main(String[] args) {

		Program7Sum program7Sum = new Program7Sum(); // Function call
		System.out.println(program7Sum.getSum());
	}

}
