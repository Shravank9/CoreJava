package com.vcubelab_dailytest.oopstask3;

public class Car extends Vehicle {

	@Override
	void drive() {

		System.out.println("called from car class");
		System.out.println("driving the car!");
		System.out.println("The driver name is Sura aravind");
		System.out.println("____________________________________");
	}

	public static void main(String args[]) {

		Car c = new Car();
		c.start();
		c.drive();

		Vehicle v = new Vehicle();
		v.drive();
		v.start();

		Vehicle v1 = new Car();
		v1.start();
		v1.drive();

		// but it cannot work ok due for name sake it resolve the compile time error but
		// it throws the classcast exception
		Car c1 = (Car) new Vehicle();
		c1.drive();
		c1.start();

	}
}
//Today's Assignment
//Java-
//1.Create a Vehicle class with a start() method. 
//Create a Car class that inherits 
//Vehicle and has a drive() method.
