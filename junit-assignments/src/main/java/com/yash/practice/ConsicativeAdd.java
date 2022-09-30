package com.yash.practice;

import java.util.Scanner;

public class ConsicativeAdd
{
	
	/*
	 * public static void main(String arg[]) { ConsicativeAdd add= new
	 * ConsicativeAdd(); int n; Scanner sc=new Scanner(System.in);
	 * 
	 * System.out.println("Enter a number :"); n=sc.nextInt();
	 * 
	 * System.out.println("Add Up To("+n+") ----->"+add.addUpTo(n)); }
	 */
	 
	public int addUpTo(int n)
	{	
	   int sum=0;
	   for(int i=1;i<=n;i++)
	   {
		sum=sum+i;
	   }
	   return sum;
        }     
}	