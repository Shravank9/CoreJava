package com.vcubelab_dailytest.oopstask5;

public class ManagementStudent extends Student{
	
	
	@Override
	void calculateGrade(int marks) {
		
		if (marks >= 95)
			System.out.println("Grade: O");
		else if (marks >= 85)
			System.out.println("Grade: A");
		else if (marks >= 70)
			System.out.println("Grade: B");
		else if (marks >= 60) 
			System.out.println("Grade: C");
		 else if (marks < 35) 
			System.out.println("Grade: Fail");
		 else if (marks > 100 || marks < 0) 
			System.out.println("Invalid Choice");
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
