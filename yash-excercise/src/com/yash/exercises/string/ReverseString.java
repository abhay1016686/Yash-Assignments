package com.yash.exercises.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Abhay";
		char[] charArray = new char[str.length()];
		for(int i=0,j=charArray.length-1;i<str.length() && j>=0;i++,j--) {
			charArray[j] = str.charAt(i);
		}
		
		for(char ch : charArray) {
			System.out.print(""+ch);
		}
		

	}

}
