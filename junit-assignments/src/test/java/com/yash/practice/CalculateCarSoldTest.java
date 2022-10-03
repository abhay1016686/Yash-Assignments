package com.yash.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yash.practice.model.Car;

public class CalculateCarSoldTest {
	
	CalculateCarSold calCarSold = new CalculateCarSold();
	
	Car car= new Car(1,120,"Abhay Rathod","Maruti");
	Car car1= new Car(2,140,"Ajinkya Rathod","Audi");
	Car car2= new Car(3,160,"Amol Rathod","Merci");
	Car car3= new Car(4,180,"Abhinav Rathod","Lamb");
	List<Car> list = new ArrayList<Car>();
	
	
	@Test
	public void testGetSoldCars() {
		
		list.add(car);
		list.add(car1);
		list.add(car2);
		list.add(car3);
		calCarSold.getSoldCars(list);
		
		
	}

	@Test
	public void testSoldCarById() {
		assertNotNull(calCarSold.soldCarById(3, list));
	}

}
