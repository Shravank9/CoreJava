package com.vcubelab_dailytest.oopstask8_15_09_26;

public class Rectangle extends Shape {

	@Override
	void area() {
		System.out.println("Enter the Length of the Rectangle");
		double l = sc.nextDouble();
		System.out.println("Enter the Breadth Of the Recatngle");
		double r = sc.nextDouble();
		System.out.println("the area of the Recatngle is the :" + (l * r));
	}

}
//Today's Assignment
//Java-
//1.Create an abstract class Shape.
//Add an abstract method area().
//Create Circle, Rectangle, and Triangle subclasses.
//Override area() in each class.