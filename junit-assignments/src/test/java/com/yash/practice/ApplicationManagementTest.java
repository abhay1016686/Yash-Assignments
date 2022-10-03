package com.yash.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yash.practice.model.Application;
import com.yash.practice.service.ApplicationService;

public class ApplicationManagementTest {
	List<Application> allApplications = new ArrayList<Application>();
	ApplicationService appService = new ApplicationService();
	String owner="Ajinkya";
	//create Applications
	Application aap1= new Application(101, "Application1", "Abhay");
	Application aap2= new Application(102, "Application2", "Amol");
	Application aap3= new Application(103, "Application3", "Ajinkya");
	
	//test add application
	@Test
	public void testAddApplication() {
		assertEquals("application has been created successfully", appService.addApplication(aap1, allApplications));
	}
	//test update application
	@Test
	public void testUpdateApplication() {
		allApplications.add(aap1);
		assertEquals("Application updated with name : changed to New Name", appService.updateApplication(101, "changed to New Name", allApplications));
	}
	//test if same owner
	@Test
	public void testIsOwner() {
		allApplications.add(aap1);
		allApplications.add(aap2);
		assertFalse(appService.isApplicationOwner(102, owner, allApplications));
	}

}
