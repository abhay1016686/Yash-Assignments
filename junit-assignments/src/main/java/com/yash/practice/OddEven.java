package com.yash.practice;

public class OddEven {

	public String countEvenOdd(long num) {
		int n = (int) num;
		int even_count = 0;
		int odd_count = 0;
		String result="";
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0)
				even_count++;
			else
				odd_count++;
			n = n / 10;
		}
		if(even_count>0) 
			result= "Even count : " + even_count;
		
		if(odd_count>0) 
			result = "Odd count : " + odd_count;
		
		return result;
	}

}
