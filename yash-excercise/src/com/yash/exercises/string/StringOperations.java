package com.yash.exercises.string;

public class StringOperations   {
	char[] str= new char[100];
	
	public int getLength(String newStr) {
		int counter=0,i=0;
			while(newStr.charAt(i) != '\0')  
			{
			  counter++;      
			  i++;            
			}
			return counter;
	}
	
	
}
