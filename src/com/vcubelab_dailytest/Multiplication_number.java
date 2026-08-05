package com.vcubelab_dailytest;

import java.util.Scanner;

public class Multiplication_number {
	
	
	static void multiplication(int a) {
		
		for (int i=1;i<=10;i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
			
		}
		
	}

	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Multiplication Table of a Number :");
		int a=sc.nextInt();
		multiplication(a);
		
		
		sc.close();
		

	}

}



//Today Task 
//Java
//1.Print the Multiplication Table of a Number
//Question:
//Write a Java program to print the multiplication table of a given number from 1 to 10.


