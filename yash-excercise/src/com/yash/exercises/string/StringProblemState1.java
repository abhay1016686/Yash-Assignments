/**Create a program in which two string is input by the user. Vowel of first string should be replace 
 * one by one second string consonant. If consonant of second string remaining all should be 
 * concat to end of first string. If all vowel of first string are not replaced you have to replace them 
 * by (underscore) _.
*/
package com.yash.exercises.string;

import java.util.Scanner;

public class StringProblemState1 {
	public static void main(String[] args) {
		// Accepting the string from user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the inputstring1");
		String inputstring1 = sc.nextLine();

		System.out.println("enter the inputstring2");
		String inputstring2 = sc.nextLine();

		// converting string to chararray
		char input1[] = inputstring1.toCharArray();
		int ind = 0;
		// logic for replace char
		for (int i = 0; i < inputstring1.length(); i++) {
			char c = inputstring1.charAt(i);
			if (c == 'a' || c == 'A' || c == 'E' || c == 'e' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				try {
					input1[i] = inputstring2.charAt(ind);
					ind++;
				} catch (StringIndexOutOfBoundsException e) {
					input1[i] = '_';
				}
			}

		}
		String s = new String(input1);
		System.out.println("Result String =" + s);
	}
}
