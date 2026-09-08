package com.vcubelab_dailytest.oopstask5;

public class EngineeringStudent extends Student {

	@Override
	void calculateGrade(int marks) {
		if (marks >= 90)
			System.out.println("Grade: A");
		else if (marks >= 75)
			System.out.println("Grade: B");
		else if (marks >= 60)
			System.out.println("Grade: C");
		else if (marks > 100 || marks < 0)
			System.out.println("Invalid Choice");
		else
			System.out.println("Grade: Fail");
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