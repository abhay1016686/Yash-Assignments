package com.yash.exercises.oops.programs;

public class Employee {
	int empId;
	String empName;
	Double empSalary;
	String deptname;
	public Employee(int empId, String empName,  String deptname) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptname = deptname;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	@Override
	public String toString() {
		return "EmployeeClone [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", deptname="
				+ deptname + "]";
	}
	
	public Object clone() // 58
	   {
	      Employee emp;
	      emp = new Employee( 
	            this.empId, this.empName, this.deptname);
	      emp.setEmpSalary(this.empSalary); // 63
	      return emp; 
	   }
	



	public static void main(String[] args) {
		Employee  emp=new Employee(11, "Priyanshi", "IT");
		emp.setEmpSalary(40000.0); // 7
		Employee emp2 = (Employee) emp.clone(); // 8
	      emp.setEmpName("Kiran"); // 9
	      System.out.println(emp); // 10
	      System.out.println(emp2); // 11
	}
}
