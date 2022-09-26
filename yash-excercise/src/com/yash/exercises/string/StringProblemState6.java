/**
 * WAP to implement split function by you.
*/
package com.yash.exercises.string;

import java.util.Scanner;

public class StringProblemState6 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Any String to Split: ");
	String str=sc.nextLine();
	char[] charArr = str.toCharArray(); 
	System.out.println("Enter token to split above string: ");
	String tok = sc.next();
	char[] tokens = tok.toCharArray();
	char token = tokens[0];
		
			for(int i=0; i<charArr.length; i++) {
				if(charArr[i]==token){
					System.out.print("\n");
				}else {
					System.out.print(""+charArr[i]);
				}
				
			}
		}

}

