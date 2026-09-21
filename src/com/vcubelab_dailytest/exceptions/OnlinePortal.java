package com.vcubelab_dailytest.exceptions;

import java.util.Scanner;

public class OnlinePortal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Find length of a string → NullPointerException

		while (true) {
			try {
				System.out.println("Enter the name:");
				String name = sc.nextLine();
				System.out.println(name.length());
				break;
			} catch (NullPointerException e) {
				System.out.println("In catch");
				e.getMessage();
			}
		}

		// Take age input from user → InputMismatchException
//		sc.nextLine();
		while (true) {
			try {

				System.out.println("Enter the age:");
				String age = sc.nextLine();
				Integer aa = Integer.parseInt(age);
				System.out.println(aa);
				break;
			} catch (NumberFormatException e) {
				System.out.println("In catch");
				System.out.println(e.getMessage());
				System.out.println(e.getCause());

			} catch (Exception e1) {
				System.out.println("in cath 2");
				System.out.println(e1.getMessage());
				System.out.println(e1.getCause());

			}
		}

		// Calculate average marks → ArithmeticException

		while (true) {
			try {

				System.out.println("Enter the Total marks:");
				double total_marks = sc.nextDouble();
				System.out.println("Enter the number of subjects:");
				double total_subject = sc.nextDouble();
				double avg = total_marks / total_subject;
				System.out.println("Average marks:" + avg);
				break;
			} catch (NumberFormatException e) {
				System.out.println("In catch");
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
			} catch (Exception e1) {
				System.out.println("in cath 2");
				System.out.println(e1.getMessage());
				System.out.println(e1.getCause());

			}
		}

		// Access array element using index → ArrayIndexOutOfBoundsException.
		while (true) {
			try {
				int[] transactionHistory = { 5000, 1000, 2000 };

				System.out.println("\nEnter transaction index:");
				int index = sc.nextInt();

				System.out.println("Transaction: " + transactionHistory[index]);
				break;

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException: Invalid transaction index");
				sc.nextLine();

			} catch (Exception e1) {
				System.out.println("in cath 2");
				System.out.println(e1.getMessage());
				System.out.println(e1.getCause());
				sc.nextLine();

			} finally {
				sc.close();
			}
		}

	}

}
//Java-
//Create a Java program for an Online Student Portal that performs multiple operations and handles different unchecked exceptions in a single application.
//Find length of a string → NullPointerException
//Take age input from user → InputMismatchException
//Calculate average marks → ArithmeticException
//Access array element using index → ArrayIndexOutOfBoundsException.
//Also use a finally block in the program
