package com.vcubelab_dailytest.oopstask5_02_09_2026;

public class Car  extends Vehicle{

	
	double speed=100;
	
	@Override
	void display(){
	 System.out.println("The speed of the car:"+speed);	
	}
	
	public static void main(String[] args) {
		
		Vehicle v=new Car();
		System.out.println("Speed:"+v.speed);
		v.display();
		

	}

}
//Today's Assignment
//
//Java-
//1.Create a Java program using inheritance with a parent class Vehicle and a child class Car.
//Requirements:
//Vehicle should have a variable speed = 50 and a method display().
//Car should have its own variable speed = 100 and override the display() method.
//Create a Car object using a parent-class reference.
//Access the speed variable and call the display() method.
//Predict the output before running the program.
//Explain why the variable and method behave differently. 
