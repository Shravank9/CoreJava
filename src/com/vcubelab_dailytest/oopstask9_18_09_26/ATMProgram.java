package com.vcubelab_dailytest.oopstask9_18_09_26;

import java.util.Scanner;

public class ATMProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started");
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();

		// withdrawl-arthmetic expression
		try {
			System.out.println("Enter withdrawal amount:");
			double withdrawal = sc.nextDouble();

			if (withdrawal <= 0) {
				throw new ArithmeticException("Invalid withdrawal amount");
			}

			if (amount >= withdrawal) {
				amount -= withdrawal;
				System.out.println("Successfully withdrawn: " + withdrawal);
				System.out.println("Remaining balance: " + amount);
			} else {
				System.out.println("Insufficient balance");
			}
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: " + e.getMessage());
		}
		System.out.println("---------------------------------------------------------------------------");
		// Convert entered amount from String to double → handle NumberFormatException
		System.out.println("Enter the string for to get NumberFormatExceptions");
		String amount1 = sc.next();
		try {
			double a = Double.parseDouble(amount1);
			System.out.println("Converted Number from String to integr:" + a);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("NumberFormatException" + e.getCause());

		}
		System.out.println("---------------------------------------------------------------------------");

		//// Display account details → handle possible NullPointerException
		System.out.println("Enter the Account number");
		String account = sc.nextLine();
		String accountName = null;

		try {
			System.out.println("in try");
			System.out.println(account.length());
			System.out.println(accountName.length());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		} catch (Exception e1) {
			System.out.println(e1.getCause());
			System.out.println(e1.getMessage());
		}
		System.out.println("---------------------------------------------------------------------------");

		//// Display account details → handle possible Stringindexoutofbound
		sc.nextLine();

		System.out.println("Enter the Account number");
		String account1 = sc.nextLine();
		System.out.println("Enter the account holdername");
		String accountName1 = sc.nextLine();

		try {
			System.out.println(account1.length());
			System.out.println(accountName1.length());
			System.out.println(accountName1.charAt(100 / 2));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
//			e.printStackTrace();

		}
		System.out.println("---------------------------------------------------------------------------");

		// 3. Access transaction history - ArrayIndexOutOfBoundsException
		try {
			int[] transactionHistory = { 5000, 1000, 2000 };

			System.out.println("\nEnter transaction index:");
			int index = sc.nextInt();

			System.out.println("Transaction: " + transactionHistory[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: Invalid transaction index");
		}

		System.out.println("Main method ended");
		sc.close();

	}

}
//Today’s Assignment:-
//
//Java: -
//1.Create an ATM program with separate try-catch blocks for:
//Withdraw amount → handle ArithmeticException
//Convert entered amount from String to double → handle NumberFormatException
//Access transaction history using an array → handle ArrayIndexOutOfBoundsException
//Display account details → handle possible NullPointerException
//Requirement: If one operation fails, the remaining operations should continue.