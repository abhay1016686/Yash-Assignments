package com.yash.practice;

import java.util.ArrayList;
import java.util.List;

import com.yash.practice.model.Application;
import com.yash.practice.service.ApplicationService;

public class ApplicationManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Application> allApplications = new ArrayList<Application>();
		ApplicationService appService = new ApplicationService();
		String owner="Ajinkya";
		//create Applications
		Application aap1= new Application(101, "Application1", "Abhay");
		Application aap2= new Application(102, "Application2", "Amol");
		Application aap3= new Application(103, "Application3", "Ajinkya");
		
		//add applications
		System.out.println(appService.addApplication(aap1, allApplications));
		System.out.println(appService.addApplication(aap2, allApplications));
		System.out.println(appService.addApplication(aap3, allApplications));
		
		for (Application application : allApplications) {
			System.out.println(application.toString());
		}
		
		//updating application
		System.out.println("\n Updating Application");
		if(appService.isApplicationOwner(103,owner, allApplications)) {
			System.out.println(appService.updateApplication(103, "New Application",allApplications));
		}else {
			System.out.println("Only Owners are allowed to update application!!");
		}
		for (Application application : allApplications) {
			System.out.println(application.toString());
		}
		
		//deleting application
		System.out.println("\n Deleting Application");
		if(appService.isApplicationOwner(102,"Amol", allApplications)) {
			appService.deleteApplication(102,allApplications);
		}else {
			System.out.println("Only Owners are allowed to delete application!!");
		}
		
		for (Application application : allApplications) {
			System.out.println(application.toString());
		}
		
	}

}
