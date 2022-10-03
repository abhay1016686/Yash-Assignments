package com.yash.practice;

import java.util.ArrayList;
import java.util.List;

import com.yash.practice.model.Student;

public class HostelRegistration {
	
	
	public static void main(String[] args) {
		HostelRegistration studRegi= new HostelRegistration();
		List<Student> studList = new ArrayList<Student>();
		Student stud1 = new Student(111, "Abhay", "5th");
		Student stud2 = new Student(112, "Amol", "6th");
		Student stud3 = new Student(113, "Abhijeet", "5th");
		Student stud4 = new Student(114, "Abhinav", "7th");
		Student stud5 = new Student(115, "Abhimanu", "5th");
		Student stud6 = new Student(116, "Abhishek", "6th");
		
		studList.add(stud1);studList.add(stud2);studList.add(stud3);studList.add(stud4);studList.add(stud5);studList.add(stud6);
		
		List<Student> finalList=studRegi.registerStudByStudId(116,studRegi.registerStudByStudId(114,studList));
		System.out.println(studRegi.getRegisteredStudents(finalList));
		
		
	}
	
	public String getRegisteredStudents(List<Student> studList) {
		// TODO Auto-generated method stub
		int count=0;
		for (Student stud : studList) {
			if(stud.isRegistered()) {
				count++;
			}
		}
		return count+" students are registered!!";
		
		
	}
	
	public List<Student> registerStudByStudId(int studId,List<Student> studList) {
		for (Student stud : studList) {
			if(stud.getStudentId()==studId) {
				stud.setRegistered(true);
			}
		}
		return studList;
	}

}
