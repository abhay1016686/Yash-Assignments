/**
 * 
 */
package com.yash.practice.service;

import java.util.List;

import com.yash.practice.model.Application;

/**
 * @author abhay.rathod
 *
 */
public interface IApplicationService {
	public String addApplication(Application appplication,List<Application> allApplications);
	
	public String updateApplication(int applicationId,String newName,List<Application> allApplications);
	
	public boolean isApplicationOwner(int appId, String applicationOnwerName,List<Application> allApplications);
	
	public void deleteApplication(int applicationId,List<Application> allApplications);
}
