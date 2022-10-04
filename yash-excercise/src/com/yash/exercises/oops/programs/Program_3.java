package com.yash.exercises.oops.programs;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter account number : ");
		int accountno = sc.nextInt();

		System.out.println("Please enter the customer name :");
		String custname = sc.next();

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Please enter customer dob in (dd/MM/yyyy) format :");
		String custDob = sc.next();

		System.out.println("Please enter customer address :");
		String custAddress = sc.next();

		System.out.println("Please enter customer account opening date in (dd/MM/yyyy) format :");
		String custAaccountOpeningDate = sc.next();

		System.out.println("Please enter branch_id : ");
		int BID = sc.nextInt();

		System.out.println("Please enter branch_name : ");
		String bname = sc.next();

		System.out.println("Please enter branch address : ");
		String branchAddress = sc.next();

		System.out.println("Please enter CAID : ");
		int CAID = sc.nextInt();

		System.out.println("Please enter Customer Id : ");
		int custId = sc.nextInt();

		System.out.println("Please enter the amount : ");
		int amount = sc.nextInt();

		System.out.println("Please enter deposit withdrawl : ");
		int depositWithdrawl = sc.nextInt();

		System.out.println("Please enter deposit date in (dd/mm/yyyy) format :");
		String depositDate = sc.next();

		Branch b = new Branch(BID, bname, branchAddress);

		Customer cust = new Customer(accountno, custname, custAddress, custDob, custAaccountOpeningDate, b);
		cust.displayCustomerDetails();

		CustomerAccountStatement c = new CustomerAccountStatement(CAID, custId, amount, depositWithdrawl, depositDate);

		c.displayCustomerAccountStatementInfo();

	}

}
