package com.yash.exercises.array;

public class Darray {

	private int arr[];
	private int count;

	public Darray(int length) {
		arr = new int[length];
	}

	public void printArray() {

		for (int i = 0; i < count; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	public void insert(int element) {

		if (arr.length == count) {

			int newArr[] = new int[2 * count];

			for (int i = 0; i < count; i++) {
				newArr[i] = arr[i];
			}

			arr = newArr;
		}

		arr[count++] = element;
	}
}
