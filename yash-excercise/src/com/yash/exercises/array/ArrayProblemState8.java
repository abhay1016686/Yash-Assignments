/**
 * You are given a sequence of Character in the form of Array. Now you have to put all vowels and 
 * consonants together in the array.
*/
package com.yash.exercises.array;

public class ArrayProblemState8 {

	public static void main(String[] args) {
		String str = "AbhayRATHOD";
		char[] charArr = str.toCharArray();

		int k = 0;
		char[] resultArray = new char[charArr.length];
		
		for (int i = 0; i < charArr.length; i++) {
			char c = charArr[i];
			if (c == 'a' || c == 'A' || c == 'E' || c == 'e' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {

				resultArray[k] = charArr[i];
				charArr[i] = '*';
				k++;
			}
		}
		
		for (int i = 0; i < charArr.length; i++)
		{
			char c = charArr[i];
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				resultArray[k] = charArr[i];
				k++;
			}
		}
		
		charArr=resultArray;
		for (char ch : charArr) {
			System.out.print(ch + "");
		}
	}

}
