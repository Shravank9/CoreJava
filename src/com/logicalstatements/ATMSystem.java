package com.logicalstatements;

import java.util.Scanner;

public class ATMSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int pin = 123456;
		String lastTransaction = "No Transactions";
		String choice = "";

		System.out.println("=========== WELCOME TO ATM ===========");
		System.out.print("Enter Initial Balance: ");
		int balance = sc.nextInt();

		do {

			System.out.println("\n=========== MAIN MENU ===========");
			System.out.println("1. Balance");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Mini Statement");
			System.out.println("5. Change PIN");
			System.out.println("6. Exit");

			System.out.print("Enter your choice: ");
			int option = sc.nextInt();

			switch (option) {

			case 1:

				System.out.print("Enter ATM PIN: ");
				int enteredPin = sc.nextInt();

				if (pin == enteredPin) {

					System.out.println("Authentication Successful");
					System.out.println("Available Balance : " + balance);

				} else {

					System.out.println("Wrong ATM PIN");
				}

				break;

			case 2:

				System.out.print("Enter Withdrawal Amount: ");
				int withdraw = sc.nextInt();

				if (withdraw < 100) {

					System.out.println("Minimum Withdrawal Amount is 100");

				} else if (withdraw > balance) {

					System.out.println("Insufficient Balance");

				} else {

					System.out.print("Enter ATM PIN: ");
					int enteredPin1 = sc.nextInt();

					if (pin == enteredPin1) {

						balance -= withdraw;

						lastTransaction = "Withdraw : " + withdraw;

						System.out.println("Withdrawal Successful");
						System.out.println("Available Balance : " + balance);

					} else {

						System.out.println("Wrong ATM PIN");
					}

				}

				break;

			case 3:

				System.out.print("Enter Deposit Amount: ");
				int deposit = sc.nextInt();

				if (deposit < 100) {

					System.out.println("Minimum Deposit Amount is 100");

				} else {

					System.out.print("Enter ATM PIN: ");
					int enteredPin2 = sc.nextInt();

					if (pin == enteredPin2) {

						balance += deposit;

						lastTransaction = "Deposit : " + deposit;

						System.out.println("Deposit Successful");
						System.out.println("Available Balance : " + balance);

					} else {

						System.out.println("Wrong ATM PIN");
					}

				}

				break;

			case 4:

				System.out.println("\n========= MINI STATEMENT =========");
				System.out.println("Available Balance : " + balance);
				System.out.println("Last Transaction  : " + lastTransaction);

				break;

			case 5:

				System.out.print("Enter Current ATM PIN: ");
				int currentPin = sc.nextInt();

				if (pin == currentPin) {

					System.out.print("Enter New ATM PIN: ");
					int newPin = sc.nextInt();

					pin = newPin;

					System.out.println("ATM PIN Changed Successfully");

				} else {

					System.out.println("Wrong ATM PIN");
				}

				break;

			case 6:

				System.out.println("Thank You For Using Our ATM");
				sc.close();
				return;

			default:

				System.out.println("Invalid Choice");

			}

			System.out.print("\nDo you want to continue (Y/N): ");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("Y"));

		System.out.println("\nThank You! Visit Again.");

		sc.close();

	}

}