package com.vcubelab_dailytest.exceptions;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number 1 :");
		String one = sc.nextLine();

		System.out.println("Enter the number 2 :");
		String two = sc.nextLine();

		try {
			int a = Integer.parseInt(one);
			int b = Integer.parseInt(two);
			int c = a / b;
			System.out.println("Divind of two aand b:" + c);
			int[] arr = { 1, 2, 3, 4, 5 };

			try {
				System.out.println("Enter the index which elemnt u wnat to access it:");
				String index = sc.nextLine();
				int inde = Integer.parseInt(index);
				System.out.println("Value in the array at index is :" + arr[inde]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Program over");

		sc.close();
	}

}
//Java: -
//1.Create a Java program that performs the following operations:
//Ask the user to enter two numbers as Strings.
//Convert the Strings into integers using Integer.parseInt().
//Divide the first number by the second number.
//Handle ArithmeticException if the second number is 0.
//Create an integer array containing 5 elements.
//Ask the user to enter an array index and display the element at that index.
//Handle ArrayIndexOutOfBoundsException if the index is invalid.
//If the user enters an invalid number while converting the String to an integer, handle NumberFormatException.
//Use separate catch blocks for all three exceptions.