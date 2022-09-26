/**
 * WAP to find third minimum number from list of numbers.
 * */
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
		     
		      return removeDuplicateElements(a,count);
		   }
		   public static int removeDuplicateElements(int arr[], int n) {
				if (n == 0 || n == 1) {
					return n;
				}
				int j = 0;
				for (int i = 0; i < n - 1; i++) {
					if (arr[i] != arr[i + 1]) {
						arr[j++] = arr[i];
					}
				}
				arr[j++] = arr[n - 1];
				return arr[2];
			}
		public static void main(String args[]) {
		      int arr[] = { 15,10,8, 8, 7, 6, 7 };
		      int num = getThirdSmallestNum(arr);
		      System.out.println("Third Smallest: " +num);
		   }
		}

