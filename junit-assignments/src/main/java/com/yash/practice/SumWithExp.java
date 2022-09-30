package com.yash.practice;

public class SumWithExp {

		  int getSum(String num)
		    {
			char[] chararr= num.toCharArray();
	    	String finalStr="";
	    	for(int i=0; i< chararr.length; i++) {
	    		
	    		if(!(("+".charAt(0)==chararr[i]) || ("-".charAt(0)==chararr[i]) 
	    				|| ("/".charAt(0)==chararr[i]) || ("*".charAt(0)==chararr[i]))) {
	    			finalStr+=chararr[i];
	    		}
	    	}
	    	int n = Integer.parseInt(finalStr);
		
		        int sum = 0;
		 
		        while (n != 0) {
		            sum = sum + n % 10;
		            n = n / 10;
		        }
		 
		        return sum;
		    }

		
		  // Driver code 
			
			
			/*
			 * public static void main(String[] args) { String n = "6/8*7"; SumWithExp
			 * sumwithexp = new SumWithExp(); // Function call
			 * System.out.println(sumwithexp.getSum(n)); }
			 */
			 
		 
}
