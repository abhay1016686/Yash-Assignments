package com.yash.practice;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yash.practice.model.Employee;

public class EmployeeCountTest {
	EmployeeCount employeeCount = new EmployeeCount();
	List<Employee> empList = new ArrayList<Employee>();
	Employee emp1= new Employee(112, "Abhay Rathod", "SSE", "Yash Technologies");
	Employee emp2= new Employee(113, "Ajinkya Rathod", "SE", "Gapgemini");
	Employee emp3= new Employee(114, "Amol Rathod", "SSE", "Yash Technologies");
	Employee emp4= new Employee(115, "Abhijeet Chavan", "SME", "HSBC");
	Employee emp5= new Employee(116, "Abhishek Jadhav", "PM", "BNY");
	Employee emp6= new Employee(117, "Abhi Pawar", "SCM", "BNY");
	
	@Test
	public void testGetEmpFromCompany() {
		empList.add(emp1);empList.add(emp2);empList.add(emp3);empList.add(emp4);empList.add(emp5);empList.add(emp6);
		
		
		assertEquals("2 employees are from BNY company.",employeeCount.getEmpFromCompany("BNY",empList));
	}

}
