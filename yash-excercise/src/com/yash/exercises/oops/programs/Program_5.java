package com.yash.exercises.oops.programs;

import java.util.Scanner;

public class Program_5 {
	
	public void getMaximum(int a[],int max) {
		
		for(int i=0;i<a.length;i++) {
			
			for(int i1=i+1;i1<a.length;i1++) {
				
				if(a[i] > a[i1]) 
				{
				 max=a[i];
				 a[i]=a[i1];
				 a[i1]=max;
				 }
			}
			
		}
		
		System.out.println("Sorted array ");
		for(int i=0;i<a.length;i++) {
			max=a[i];
			System.out.println(a[i]);
		}
	
		
		System.out.println("maximum number:- "+max);
		
		
	}
	public void getMaximum(String arr[],String max) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
	
				if(arr[i].length() > arr[j].length()) {
					max=arr[i];
					arr[i]=arr[j];
					arr[j]=max;
				}
			}
		}
		System.out.println("Longest String :- "+arr[arr.length-1]);
	}
	public static void main(String[] args) {
		Program_5 f=new Program_5();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Array Size");
		int size=sc.nextInt();
		int max = 0;
		System.out.println("Enter the Array element");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the Array element");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
		System.out.println("Enter the String Array Size");
		int size1=sc.nextInt();
		String arr1[]=new String[size1];
		String maximum="";
		System.out.println("Enter the String Array");
		for(int i=0;i<size;i++) {
			arr1[i]=sc.next();
		}
		
		System.out.println("the string element");
		for(int i=0;i<size;i++) {
			System.out.println(arr1[i]);
			
		}
		
		
		f.getMaximum(arr, max);
		f.getMaximum(arr1, maximum);
	}

}
