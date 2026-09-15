package com.vcubelab_dailytest.oopstask8_15_09_26;

public class Triangle extends Shape{

	@Override
	void area() {
		System.out.println("Enter the Height of the Triangle");
		double h = sc.nextDouble();
		System.out.println("Enter the Base Of the Triangle");
		double b = sc.nextDouble();
		System.out.println("the are of the Triangle is the :" +0.5* (h* b));		
	}

}
//Today's Assignment
//Java-
//1.Create an abstract class Shape.
//Add an abstract method area().
//Create Circle, Rectangle, and Triangle subclasses.
//Override area() in each class.