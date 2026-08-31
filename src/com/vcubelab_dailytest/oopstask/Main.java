package com.vcubelab_dailytest.oopstask;

import java.util.Scanner;

public class Main extends BankAccount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balance:");
		double bal = sc.nextDouble();

		Main t = new Main();

		t.setBalance(bal);

		while (true) {
			System.out.println("1)Depoist \n2)Withdrawl \n3)Final Balance \n4)Exit");

			System.out.println("Enter the Choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1 -> {
				System.out.println("Enter the amount you want to depoist it!");
				double amount = sc.nextDouble();
				t.depoist(amount);

			}
			case 2 -> {
				System.out.println("Enter the amount you want to Withdrawl it!");
				double amount = sc.nextDouble();
				t.Withdrawal(amount);
			}
			case 3 -> {
				System.out.println("The current balance is :" + t.getBalance());
			}

			case 4 -> {
				return;

			}
			default -> System.out.println("Inavlid option");
			}
		}

	}

}

//Today's Assignment
//Batch 75-
//Java-
//1.Create a BankAccount class using Encapsulation.
//Declare accountNumber, holderName, and balance as private.
//Initialize the balance with ₹5000 using a constructor or directly.
//Create a deposit(double amount) method to add money to the account.
//Create a withdraw(double amount) method that allows withdrawal only if the balance is sufficient.
//In main(), create an object, perform deposit and withdrawal operations, and display the final balance.
