package com.vcubelab_dailytest.oopstask8_15_09_26;

public class Circle extends Shape {

	@Override
	void area() {
		System.out.println("Enter the radius of the circle");
		double r = sc.nextDouble();
		System.out.println("the area of the circle is the :" + Math.PI * r*r);

	}

}
//Today's Assignment
//Java-
//1.Create an abstract class Shape.
//Add an abstract method area().
//Create Circle, Rectangle, and Triangle subclasses.
//Override area() in each class.