package com.yash.exercises.string;

import java.util.Scanner;

public class StringProblemState3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String inputStr = sc.next();
		char[] charArr= new char[inputStr.length()];
		char[] newCharArr= new char[inputStr.length()];
		int newCharArrayLengh=0;
		for(int i=0; i<inputStr.length(); i++) {
			charArr[i] = inputStr.charAt(i);
		}
		for(int k=0;k<charArr.length; k++) {
			char ch= charArr[k];
			int chInt =ch;
			if(chInt >= 97 && chInt<(97+26)) {
			for(int i = 'a',j=0; i<'z'; i++,j++) {
				if(ch == (char) i ) {
					for(int l='A'; l<'Z';l++) {
						if(i==(l+32)) {
							newCharArr[newCharArrayLengh]=(char) l;
							newCharArrayLengh++;
							break;
						}
						
					}
				}
				
			}
			}else {
			for(int i = 'A'; i<'Z'; i++) {
				if(ch == (char) i ) {
					for(int l='a'; l<'z';l++) {
						if(i==(l-32)) {
							newCharArr[newCharArrayLengh]=(char) l;
							newCharArrayLengh++;
							break;
						}
						
					}
				}
			}
			}
			
		}
		
		for(char newchar : newCharArr) {
			System.out.print(""+newchar);
		}


	}

}
