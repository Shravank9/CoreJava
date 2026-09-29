package com.vcubelab_dailytest.exceptions.customexceptions;

public class InvalidPasswordException extends Exception {

	public InvalidPasswordException(String msg) {
		super(msg);
		System.out.println("Invalid credentials!");
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