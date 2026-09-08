package com.vcubelab_dailytest.oopstask5;

import java.util.Scanner;

public class Main {

	static String name;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student s = null;

		while (true) {
		System.out.println("Which One You want to Select?");
		System.out.println("1) EngineeringStudent\n2) MedicalStudent\n3) ManagementStudent\n4) Exit");

		System.out.println("Enter the choice:");
		int choice = sc.nextInt();

		

			switch (choice) {

			case 1:
				s = new EngineeringStudent();
				break;

			case 2:
				s = new MedicalStudent();
				break;

			case 3:
				s = new ManagementStudent();
				break;
			case 4:
				System.out.println("Susceesfully Exited!");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice");
				sc.close();
				return;
			}

			sc.nextLine();

			System.out.println("Enter the Name:");
			name = sc.nextLine();

			System.out.println("Enter the marks:");
			int marks = sc.nextInt();

			s.calculateGrade(marks);


		}
		

	}


}
//Today's Assignment
//
//Java-
//
//1.Create a parent class Student with method calculateGrade().
//Create child classes EngineeringStudent, MedicalStudent, ManagementStudent 
//overriding it with their own grading criteria.
//Accept marks from user.
//Use a parent class reference to hold child objects.
//Demonstrate runtime polymorphism by calling calculateGrade().
