package com.yash.practice;

public class Car {
	
	
	private int carid;
	private int speed;
	private String carOwnerName;
	private String carType;
	private boolean isSold=false;
	
	public Car(int carid,int speed, String carOwnerName, String carType) {
		super();
		this.carid = carid;
		this.speed = speed;
		this.carOwnerName = carOwnerName;
		this.carType = carType;
	}
	
	
	/**
	 * @return the carid
	 */
	public int getCarid() {
		return carid;
	}

	/**
	 * @param carid the carid to set
	 */
	public void setCarid(int carid) {
		this.carid = carid;
	}
	/**
	 * @return the isSold
	 */
	public boolean isSold() {
		return isSold;
	}


	/**
	 * @param isSold the isSold to set
	 */
	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}
/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * @return the carOwnerName
	 */
	public String getCarOwnerName() {
		return carOwnerName;
	}
	/**
	 * @param carOwnerName the carOwnerName to set
	 */
	public void setCarOwnerName(String carOwnerName) {
		this.carOwnerName = carOwnerName;
	}
	/**
	 * @return the carType
	 */
	public String getCarType() {
		return carType;
	}
	/**
	 * @param carType the carType to set
	 */
	public void setCarType(String carType) {
		this.carType = carType;
	}

}
