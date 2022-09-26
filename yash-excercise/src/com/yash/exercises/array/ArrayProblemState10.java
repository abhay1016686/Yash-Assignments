/**You are having array of numbers. Now you have to arrange numbers in array on the basis of the 
 * length of each number. Smallest number length will be first and so on.
*/
package com.yash.exercises.array;

import java.util.Scanner;

public class ArrayProblemState10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many numbers you want to be enter: ");
		int totalNumbersLength = sc.nextInt();
		int[] allNums = new int[totalNumbersLength];
		System.out.println("Please enter numbers : ");
		// totalNames
		for (int i = 0; i < totalNumbersLength; i++) {
			allNums[i] = sc.nextInt();
		}

		for (int i = 0; i < allNums.length; i++) {

			for (int j = i + 1; j <allNums.length; j++) {
				int fsize= calculateSize(allNums[i]);
				int ssize= calculateSize(allNums[j]);
				if (fsize > ssize) {
					int temp = allNums[i];
					allNums[i] = allNums[j];
					allNums[j] = temp;
				}

			}
		}
		System.out.println("Sorted numbers by length are: ");
		for (int num : allNums) {
			System.out.println("" + num);
		}
	}

	private static int calculateSize(int num) {
		// TODO Auto-generated method stub
		int count =0;
		
		while(num/10!=0) {
			num=num/10;
			count++;
		}
		return count;
	}
}
