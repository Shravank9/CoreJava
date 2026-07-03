/* 
1. Write a Java program to create a class "Rectangle" with a method "calculateArea()". 
The method should take no arguments and return no value. 
Initialize the length and breadth inside the method, calculate the area of the rectangle, and display the result.
*/


package com.vcubelab_dailytest;

public class RectangleArea {
	int length;
	int breadth;
	
	void calculateArea() {
		length=10;
        breadth=21;
        int area=length*breadth;
             System.out.println("Area of Rectangle = " + area);

	}

	public static void main(String[] args) {
		
		RectangleArea t=new RectangleArea();
		t.calculateArea();

	}

}
