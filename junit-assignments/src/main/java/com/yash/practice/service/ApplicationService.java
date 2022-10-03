package com.yash.practice.service;

import java.util.List;

import com.yash.practice.model.Application;

public class ApplicationService implements IApplicationService {

	public String addApplication(Application newApp,List<Application> allApplications) {
		// TODO Auto-generated method stub
		String res = "";
		if (null != newApp) {
			allApplications.add(newApp);
			res = "application has been created successfully";
		} else {
			res = "application failed to add!!";
		}
		return res;
	}

	public String updateApplication(int applicationId, String newName,List<Application> allApplications) {
		// TODO Auto-generated method stub
		String res="No application found with this id : "+applicationId;
		for (Application application : allApplications) {
			if(applicationId == application.getApplicationId()) {
				application.setApplicationName(newName);
				res="Application updated with name : "+newName;
			}
		}
		return res;
	}

	public boolean isApplicationOwner(int appId, String applicationOnwerName,List<Application> allApplications) {
		boolean allowed=false;
		// TODO Auto-generated method stub
		if(!applicationOnwerName.isEmpty()) {
			for (Application application : allApplications) {
				if((applicationOnwerName.equals(application.getApplicationOwner().toString()))
						&& (appId == application.getApplicationId()) ) {
					allowed=true;
				}
			}
		}
		
		return allowed;
	}

	public void deleteApplication(int applicationId,List<Application> allApplications) {
		// TODO Auto-generated method stub
		String res="No application found with this id : "+applicationId;
		for (Application application : allApplications) {
			if(applicationId == application.getApplicationId()) {
				allApplications.remove(application);
				res = "Application "+applicationId+" id deleted !!";
			}
		}
		System.out.println(res);
	}

}
