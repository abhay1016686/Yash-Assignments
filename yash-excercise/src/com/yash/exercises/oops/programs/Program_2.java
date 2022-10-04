package com.yash.exercises.oops.programs;

import java.util.Scanner;

/*Create class/interface Shape which will have only one method area. Create class 
Triangle, Sphere and Circle all will extends/implements Shape. In class Triangle, 
Sphere and Circle depending upon the type of shap you have to take the input from 
the user to calculate the area of the different shape.*/
class Circle implements Shape{
	
	@Override
	public void area(int x,int y)
    {
        double z = 3.14 * x * x;
        
           System.out.println("the area of the circle is "+ z);    
   }
	
}
class Triangle implements Shape{

	@Override
	public void area(int x,int y)
    {
        int areaOfTriangle = (x*y)/2;
        System.out.println("The area of the Triangle is "+ areaOfTriangle);
          
    }
	
}
class Sphere implements Shape{

	@Override
	public void area(int x,int y)
    {
		  x=37;  
         double pie=3.14285714286;  
         double area_sphere=4*pie*(x*x);  
      System.out.println("the area of the sphere is "+ area_sphere);    
        
    }
	
}
public class Program_2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		 int firstNumber=sc.nextInt();
		 
		
		 System.out.println("Enter the Second number : ");
	        int secondNumber=sc.nextInt();
	       
	        Circle cir = new Circle();
	        cir.area(firstNumber,0);
	        
	        Triangle tri = new Triangle();
	        tri.area(firstNumber,secondNumber);
	        
	        Sphere squ = new Sphere();
	        squ.area(firstNumber,secondNumber);
		

	}

}
