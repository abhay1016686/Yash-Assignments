/**
 * WAP to remove the String which is not palindrome string from the array of String.
*/
package com.yash.exercises.array;

import java.util.Scanner;

public class ArrayProblemState11 {

	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i++) != str.charAt(j--))
				return false;
		}
		return true;
	}

	static String removeNonPalinWords(String str) {

		String final_str = "", word = "";

		str = str + " ";
		int n = str.length();

		for (int i = 0; i < n; i++) {
			if (str.charAt(i) != ' ')
				word = word + str.charAt(i);
			else {
				if ((isPalindrome(word)))
					final_str += word + " ";
				word = "";
			}
		}

		return final_str;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str=sc.nextLine();
		System.out.print(removeNonPalinWords(str));
	}
}
