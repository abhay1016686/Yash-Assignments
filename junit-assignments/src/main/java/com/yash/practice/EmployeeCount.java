package com.yash.practice;

import java.util.ArrayList;
import java.util.List;

import com.yash.practice.model.Employee;

public class EmployeeCount {

	public static void main(String[] args) {
		EmployeeCount employeeCount = new EmployeeCount();
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1= new Employee(112, "Abhay Rathod", "SSE", "Yash Technologies");
		Employee emp2= new Employee(113, "Ajinkya Rathod", "SE", "Gapgemini");
		Employee emp3= new Employee(114, "Amol Rathod", "SSE", "Yash Technologies");
		Employee emp4= new Employee(115, "Abhijeet Chavan", "SME", "HSBC");
		Employee emp5= new Employee(116, "Abhishek Jadhav", "PM", "BNY");
		Employee emp6= new Employee(117, "Abhi Pawar", "SCM", "BNY");
		empList.add(emp1);empList.add(emp2);empList.add(emp3);empList.add(emp4);empList.add(emp5);empList.add(emp6);
		
		System.out.println(employeeCount.getEmpFromCompany("BNY",empList));
		
	}

	public String getEmpFromCompany(String comanyName, List<Employee> empList) {
		int count=0;
		for (Employee employee : empList) {
			if(comanyName.equals(employee.getEmpCompanyName())){
				count++;
			}
		}
		
		return count+" employees are from "+comanyName+" company.";
		// TODO Auto-generated method stub
		
	}

}
