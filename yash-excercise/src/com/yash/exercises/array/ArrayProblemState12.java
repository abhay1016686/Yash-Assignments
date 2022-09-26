/**
 * WAP to sort array on the basis of unit place. For example we are having following numbers:-
10,2,3,41,12,13,19,81,9,100. Output will be 10,100,41,81,2,12,3,13,19,9.
*/
package com.yash.exercises.array;

public class ArrayProblemState12 {

	public static void main(String[] args) {
		int[] inputNums = { 10, 2, 3, 41, 12, 13, 19, 81, 9, 100 };
		int temp;
		System.out.println("Original Array :");
		for (int i = 0; i < inputNums.length; i++) {
			System.out.print(inputNums[i] + "  ");
		}

		for (int i = 0; i < inputNums.length; i++) {
			for (int j = i + 1; j < inputNums.length; j++) {
				if (inputNums[i] % 10 > inputNums[j] % 10) {
					temp = inputNums[i];
					inputNums[i] = inputNums[j];
					inputNums[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted Array :");
		for (int i = 0; i < inputNums.length; i++) {
			System.out.print(inputNums[i] + "  ");
		}

	}
}
