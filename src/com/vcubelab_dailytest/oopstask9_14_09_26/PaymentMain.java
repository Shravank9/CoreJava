package com.vcubelab_dailytest.oopstask9_14_09_26;

import java.util.Scanner;

public class PaymentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = "";

		do {

			System.out.println("Enter amount need to paid:");
			double amount = sc.nextDouble();

			System.out.println("Which one do you want to select?");
			System.out.println("1)CreditCard\n2)UPI\n3)NetBanking\n4)Exit");
			System.out.println("Enter the choice:");
			int choice = sc.nextInt();

			switch (choice) {

			case 1 -> {
				Payment p1 = new CreditCard();
				p1.pay(amount);

			}

			case 2 -> {
				Payment p2 = new UPI();
				p2.pay(amount);
			}

			case 3 -> {
				Payment p3 = new NetBanking();
				p3.pay(amount);
			}
			case 4 -> {
				System.out.println("Thank visit again!");
				sc.close();
				return;
			}
			default -> {
				System.out.println("Inavlid choice");
			}

			}

			System.out.println("Do you want continue again?(Y/N)");
			s = sc.next();

		} while (s.equalsIgnoreCase(s));

		sc.close();
	}
}