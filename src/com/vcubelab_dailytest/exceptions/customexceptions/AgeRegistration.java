package com.vcubelab_dailytest.exceptions.customexceptions;

import java.util.Scanner;

public class AgeRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age of the Person:");
		int age = sc.nextInt();

		try {
			if (age < 18) {
				throw new InvalidAgeException("Age is not considerable due to the it is less than 18");
			} else {
				System.out.println("Registration is Sucessfully!");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		} finally {
			sc.close();
		}
	}

}
//Today's Assignment
//
//Java-
//
//1.Create a Java program that accepts a user's age and creates a custom exception InvalidAgeException. 
//Throw the exception if the age is less than 18; otherwise, display "Registration Successful."
//2.Create a Java program that accepts a password and creates a custom 
//exception InvalidPasswordException. Throw the exception if the password less than 8 characters; 
//otherwise, display "Password Accepted."
