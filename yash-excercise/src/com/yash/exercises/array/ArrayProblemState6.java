/**
 * An array contains different numbers. You have to calculate average of two consecutive 
 * numbers. 
*/
package com.yash.exercises.array;

import java.util.Scanner;

public class ArrayProblemState6 {
	public static void main(String[] args) {
		int n, sum = 0;
		float average;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			sum = sum + a[i];
		}
		System.out.println("Sum:" + sum);
		average = (float) sum / n;
		System.out.println("Average:" + average);
	}
}
