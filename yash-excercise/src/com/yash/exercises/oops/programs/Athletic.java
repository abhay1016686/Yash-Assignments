package com.yash.exercises.oops.programs;

public class Athletic {
	private int aid;
	private String aname;
	private String paddress;
	private String dob;

	public Athletic(int aid, String aname, String paddress, String dob) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.paddress = paddress;
		this.dob = dob;
	}

	/**
	 * this is to display all records
	 */
	void display() {
		System.out.println("ID:- " + aid);
		System.out.println("aname:- " + aname);
		System.out.println("paddress:- " + paddress);
		System.out.println("dob:- " + dob);
	}

}
