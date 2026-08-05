package com.logicalstatements;

import java.util.Scanner;

public class ATMSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome tO ATM!");
		System.out.println("Main Menu");
		System.out.println("1 Balance");
		System.out.println("2 Withdraw");
		System.out.println("3 Deposit");
		System.out.println("4 Mini Statement");
		System.out.println("5 Change PIN");
		System.out.println("6 Exit");

		System.out.println("Enter the d(balance) :");
		int d = sc.nextInt();
		String s="";
		
		do {

		System.out.println("Enter the choice :");
		int a = sc.nextInt();

		switch (a) {

		case 1:
			System.out.println("Enter your ATM pin");
			int c = 123456;
			int b = sc.nextInt();
			if (c == b) {
				System.out.println("Sucessfully");
				System.out.println("Your balance is :" + d);
			} else {
				System.out.println("Entered Wrong ATM PIN");
				System.out.println("Try Again After some time!");

			}
			break;

		case 2:
			System.out.println("Enter amount you want to withdrawl:");
			int z = sc.nextInt();
			int c1 = 123456;

			if (z <= d && z >= 100) {
				System.out.println("Enter your ATM pin");
				int b1 = sc.nextInt();
				if (c1 == b1) {
					System.out.println("Sucessfully withdrawl of your amount:" + z);
					d -= z;
					System.out.println("Available Balance:" + d);
				} else {
					System.out.println("Entered Wrong ATM PIN");
					System.out.println("Try Again After some time!");
				}
			}

			else {
				System.out.println(
						"Withdrawal cancelled due to insufficient balance or minimum withdrawal amount not met.");
				System.out.println("Available Balance:" + d);
			}
			break;

		case 3:
			System.out.println("Enter the depoist amount");
			int y = sc.nextInt();
			int c2 = 123456;
			if (y >= 100) {
				System.out.println("Enter your ATM pin");
				int b2 = sc.nextInt();

				if (c2 == b2) {
					System.out.println("Sucessfully depoisted amount");
					d += y;
					System.out.println("Available Balance:" + d);
				} else {
					System.out.println(
							"Deposited cancelled due to  minimum deposit amount not met or due  wrong ATM PIN entered.");
					System.out.println("Available Balance:" + d);

				}

			} else {
				System.out.println("depoisted failed due to minimal amount");
				System.out.println("Available Balance:" + d);
			}

			break;

		case 4:
			System.out.println("===== MINI STATEMENT =====");
			System.out.println("Current Balance : " + d);
			break;

		case 5:
			
			System.out.println("Enter your ATM pin");
			int b3 = sc.nextInt();
			int c3 = 123456;
			if (c3 == b3) {
				System.out.println("Enter the new ATM Pin");
				int x = sc.nextInt();
				c3 = x;
				System.out.println("Successfully Changed ATM pin!");
				

			} else {
				System.out.println("Entered wrong ATM pin");
				System.out.println("ATM PIN Chnage is cancelled !");
			}
			break;

		case 6:
			System.out.println("Exited Sucessfully !");
			sc.close();
			return;
			
			
		 default:
		        System.out.println("Invalid choice");

		}
		
		System.out.println("Do u want to continue(Y/N) ! ");
		s=sc.next();
	}while(s.equalsIgnoreCase("Y"));
		sc.close();

	}

}

//Welcome to ATM
//
//Enter PIN
//
//Main Menu
//
//1 Balance
//
//2 Withdraw
//
//3 Deposit
//
//4 Mini Statement
//
//5 Change PIN

//6 Exit
