package com.vcubelab_dailytest;

import java.util.Scanner;

public class Check_Is_Postive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the A");
		double a = sc.nextDouble();
		String grade = (a >= 90) ? "A" : (a >= 75) ? "B" : (a >= 60) ? "C" : (a >= 40) ? "D" : "Fail";
		System.out.println("Grade of the Student is:" + grade);

		sc.close();

	}

}

//Java
//1.Check whether a number is positive or negative using the ternary operator.
//2.Assign a grade based on marks using nested ternary operators.
//Marks >= 90 → A
//Marks >= 75 → B
//Marks >= 60 → C
//Marks >= 40 → D
//Otherwise → Fail
