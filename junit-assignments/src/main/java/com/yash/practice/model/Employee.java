package com.yash.practice.model;

public class Employee {
	private int empId;
	private String empName;
	private String empDesignation;
	private String empCompanyName;
	public Employee(int empId, String empName, String empDesignation, String empCompanyName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empCompanyName = empCompanyName;
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empDesignation
	 */
	public String getEmpDesignation() {
		return empDesignation;
	}
	/**
	 * @param empDesignation the empDesignation to set
	 */
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	/**
	 * @return the empCompanyName
	 */
	public String getEmpCompanyName() {
		return empCompanyName;
	}
	/**
	 * @param empCompanyName the empCompanyName to set
	 */
	public void setEmpCompanyName(String empCompanyName) {
		this.empCompanyName = empCompanyName;
	}
	
	
	

}
