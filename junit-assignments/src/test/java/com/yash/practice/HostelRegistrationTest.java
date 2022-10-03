package com.yash.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yash.practice.model.Student;

public class HostelRegistrationTest {
	HostelRegistration studRegi= new HostelRegistration();
	List<Student> studList = new ArrayList<Student>();
	Student stud1 = new Student(111, "Abhay", "5th");
	Student stud2 = new Student(112, "Amol", "6th");
	Student stud3 = new Student(113, "Abhijeet", "5th");
	Student stud4 = new Student(114, "Abhinav", "7th");
	Student stud5 = new Student(115, "Abhimanu", "5th");
	Student stud6 = new Student(116, "Abhishek", "6th");
	
	
	@Test
	public void testGetRegisteredStudents() {
		studList.add(stud1);studList.add(stud2);studList.add(stud3);studList.add(stud4);studList.add(stud5);studList.add(stud6);
		
		assertEquals("2 students are registered!!", studRegi.getRegisteredStudents(studRegi.registerStudByStudId(116,studRegi.registerStudByStudId(114,studList))));
	}

	@Test
	public void testRegisterStudByStudId() {
		studList.add(stud1);studList.add(stud2);studList.add(stud3);studList.add(stud4);studList.add(stud5);studList.add(stud6);

			assertNotNull(studRegi.registerStudByStudId(114,studList));
		}

}
