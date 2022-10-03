package com.yash.practice;

import java.util.ArrayList;
import java.util.List;

import com.yash.practice.model.Car;

public class CalculateCarSold {

	public static void main(String[] args) {
		CalculateCarSold calCarSold = new CalculateCarSold();
		Car car= new Car(1,120,"Abhay Rathod","Maruti");
		Car car1= new Car(2,140,"Ajinkya Rathod","Audi");
		Car car2= new Car(3,160,"Amol Rathod","Merci");
		Car car3= new Car(4,180,"Abhinav Rathod","Lamb");
		List<Car> list = new ArrayList<Car>();
		list.add(car);list.add(car1);list.add(car2);list.add(car3);
		
		//mark card sold
		List<Car> carlist= calCarSold.soldCarById(01,list);
		List<Car> updatedcarlist = calCarSold.soldCarById(03,carlist);
		calCarSold.getSoldCars(updatedcarlist);
		
	}

	public void getSoldCars(List<Car> carlist) {
		// TODO Auto-generated method stub
		for (Car car : carlist) {
			if(car.isSold()) {
				System.out.println("Car with car id: "+car.getCarid()+" is sold!!" );
			}
		}
		
		
	}
	
	public List<Car> soldCarById(int id,List<Car> carlist) {
		for (Car car : carlist) {
			if(car.getCarid()==id) {
				car.setSold(true);
			}
		}
		return carlist;
	}

}
