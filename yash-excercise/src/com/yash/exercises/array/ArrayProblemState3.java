/**
 * WAP to create a dynamic array. Dynamic Array means when user want to input the number
*/
package com.yash.exercises.array;

public class ArrayProblemState3 {

	public static void main(String[] args) {

		Darray numbers = new Darray(3);
		
		numbers.insert(10);
		numbers.insert(30);
		numbers.insert(40);
		numbers.insert(50);
		numbers.insert(51);

		numbers.printArray();
	}
}
