package com.yash.practice.model;

public class Application {
	private int applicationId;
	private String applicationName;
	private String applicationOwner;

	public Application(int applicationId, String applicationName, String applicationOwner) {
		super();
		this.applicationId = applicationId;
		this.applicationName = applicationName;
		this.applicationOwner = applicationOwner;
	}

	/**
	 * @return the applicationId
	 */
	public int getApplicationId() {
		return applicationId;
	}

	/**
	 * @param applicationId the applicationId to set
	 */
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * @return the applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * @param applicationName the applicationName to set
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	/**
	 * @return the applicationOwner
	 */
	public String getApplicationOwner() {
		return applicationOwner;
	}

	/**
	 * @param applicationOwner the applicationOwner to set
	 */
	public void setApplicationOwner(String applicationOwner) {
		this.applicationOwner = applicationOwner;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", applicationName=" + applicationName
				+ ", applicationOwner=" + applicationOwner + "]";
	}
	
	

}
