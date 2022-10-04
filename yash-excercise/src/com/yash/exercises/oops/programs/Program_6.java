package com.yash.exercises.oops.programs;

import java.util.Scanner;

/*With the help of method overriding perform the string comparison. User will input 
two string and your task is to compare both the string one alphabets at a time.*/
interface Compare {
	void compareString(String s1, String s2);
}

public class Program_6 implements Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two String");
		String s1 = sc.next();
		String s2 = sc.next();
		Program_6 s = new Program_6();
		s.compareString(s1, s2);

	}

	@Override
	public void compareString(String s1, String s2) {
		// TODO Auto-generated method stub
		char ch[] = s1.toCharArray();
		char ch1[] = s2.toCharArray();

		if (ch.length != ch1.length) {
			System.out.println("String does not matched");
		} else {
			for (int i = 0, j = 0; i < ch.length; i++, j++) {
				int fch = ch[i];
				int sch = ch1[j];

				while (fch != sch) {
					System.out.println("String does not matched");
					break;
				}
				System.out.println("String matched");

			}
		}
	}

}
