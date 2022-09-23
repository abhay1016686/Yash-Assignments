package com.yash.exercises.array;

public class ArrayProblemState1 {
	
		   public static int getThirdSmallestNum(int[] a) {
		      int temp;
		      int count=0;
		      for(int i:a){
		          count++;
		      }
		      for (int i = 0; i < count; i++) {
		         for (int j = i + 1; j < count; j++) {
		            if (a[i] > a[j]) {
		               temp = a[i];
		               a[i] = a[j];
		               a[j] = temp;
		            }
		         }
		      }
		     
		      return a[2];
		   }
		   public static void main(String args[]) {
		      int arr[] = { 15,10,4, 15, 9, 13, 2 };
		      int num = getThirdSmallestNum(arr);
		      System.out.println("Third Smallest: " +num);
		   }
		}

