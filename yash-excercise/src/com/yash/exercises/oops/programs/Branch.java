package com.yash.exercises.oops.programs;

public class Branch {
	int branch_id;
	String branchName,branchAddress;
	Branch()
	{
		System.out.println("default constructor : ");
	 }
	public Branch(int branch_id, String branchName, String branchAddress) {
		super();
		this.branch_id = branch_id;
		this.branchName = branchName;
		this.branchAddress = branchAddress;
	}
	void displayBranch()
	{
		System.out.println("the branch_id is :- "+branch_id);
		System.out.println("the branch_name is:-  "+branchName);
		System.out.println("the branch_address is :-  "+branchAddress);
	}
	
}
