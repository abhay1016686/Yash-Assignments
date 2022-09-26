package com.yash.exercises.string;

import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total teams to be created: ");
		
		int sizeOfJaggedArray = sc.nextInt();// row size
		
		String[][] jaggaedArray = new String[sizeOfJaggedArray][];
		for (int row = 0; row < jaggaedArray.length; row++) {
			
			System.out.println("Enter total number of team members of team " + (row+1) + ": ");
			int sizeOfColumn = sc.nextInt();
			jaggaedArray[row] = new String[sizeOfColumn];
			System.out.println("Enter member name: ");
			
			for (int col = 0; col < jaggaedArray[row].length; col++) {

				jaggaedArray[row][col] = sc.next();
			}
		}

		for (int row = 0; row < jaggaedArray.length; row++) {
			System.out.println();
			for (int col = 0; col < jaggaedArray[row].length; col++) {
				System.out.print(" " + jaggaedArray[row][col]);
			}

		}
	}

}
