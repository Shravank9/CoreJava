package com.vcubelab_dailytest.oopstask3;

import java.util.Scanner;

public class Student extends Person {

	String collegeName;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public static void main(String[] args) {

		Student s = new Student();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name of the Student :");
		String name = sc.nextLine();

		System.out.println("Enter the age of the Student:");
		int age = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter the  Name of the Collage:");
		String collegeName = sc.nextLine();

		s.setAge(age);
		s.setName(name);
		s.setCollegeName(collegeName);

		System.out.println("Name Of the Student:" + s.getName());
		System.out.println("Age of the Student:" + s.getAge());
		System.out.println("Collage of the Student:" + s.getCollegeName());

		
		
		sc.close();
	}

}

//Today's Assignment
//Java-

//2.Create a Person class with name and age. 
//Create a Student class that inherits from Person and adds collegeName.