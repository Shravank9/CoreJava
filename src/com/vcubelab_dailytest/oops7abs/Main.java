package com.vcubelab_dailytest.oops7abs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = "";

		do {
			System.out.println("Which one do you want to select?");
			System.out.println("1)SavingsAccount\n2)CurrentAccount\n3)Exit");

			System.out.println("Enter the choice");
			int choice = sc.nextInt();

			Account a = null;
			switch (choice) {

			case 1 -> {
				a = new SavingsAccount();
				Account.hello();
				a.welcome();
				a.calculateInterest();
			}
			case 2 -> {
				a = new CurrentAccount();
				Account.hello();
				a.welcome();
				a.calculateInterest();
			}
			case 3 -> {
				System.out.println("Thank you for visit again!");

			}

			default -> {
				System.out.println("Inavlaid choice");
				sc.close();
				return;
			}

			}

//			sc.nextLine();
			System.out.print("Do you want to continue? ");
			s = sc.next();

		} while (s.equalsIgnoreCase("y"));

		
		
		sc.close();
	}

}
//Today's Assignment
//
//Java-
//1.Create an abstract class Account with a 
//static method, concrete method, and abstract method. Create two subclasses 
//and determine which methods can be accessed using the class name and which require an object.