package com.vcubelab_dailytest;

import java.util.Scanner;

public class Movie_Theater_Offers {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);	
		System.out.println("Select Ticket Type:");
		System.out.println("1. Silver - Rs.200");
		System.out.println("2. Gold - Rs.300");
		System.out.println("3. Platinum - Rs.500");
		System.out.println("4. Exit");
		System.out.println("Enter you Choice:");
		int choice=sc.nextInt();

	
		
		
		switch(choice) {
		
		case  1->
		{
			double price =200;
			System.out.println("Enter your Age:");
			int age=sc.nextInt();
			if(age>=60) {
				price=price-(0.10*price);
				System.out.println("Silver Ticket Price: Rs." + price);
			}else {
				
				System.out.println("Silver Ticket Price: Rs." + price);
			}
		}
		case 2->
		{
			double price =300;
			System.out.println("Enter your Age:");
			int age=sc.nextInt();
			if(age>=60) {
				price=price-(0.10*price);
				System.out.println("Gold Ticket Price: Rs." + price);
			}else {
				System.out.println("Gold Ticket Price: Rs." + price);
			}
			
		}
		
		case 3->
		{
			double price =500;
			System.out.println("Enter your Age:");
			int age=sc.nextInt();
			if(age>=60) {
				price=price-(0.10*price);
				
				System.out.println("Platinum Ticket Price: Rs." + price);
			}else {
				System.out.println("Platinum Ticket Price: Rs." + price);
			}
			
		}
		
		case 4-> System.out.println("Thank you! Visit Again.");
		default ->System.out.println("Invalid Selection");
		}
		sc.close();

	}

}

//Question:
//1.A movie theater offers three types of tickets:
//1 → Silver (₹200)
//2 → Gold (₹300)
//3 → Platinum (₹500)
//•Write a Java program that:
//•Accepts the ticket type and customer's age as input.
//•Uses a switch statement to determine the ticket type and price.
//•Uses an if statement inside each case to check whether the customer is a senior citizen (age ≥ 60).
//•If the customer is a senior citizen, apply a 10% discount on the ticket price.
//•Display the ticket type and the final ticket price.
//Output
//Select Ticket Type:
//1. Silver - Rs.200
//2. Gold - Rs.300
//3. Platinum - Rs.500
//4. Exit
//Enter your choice: 2
//Enter your age: 65
//Gold Ticket Price: Rs.270.0
//
//Select Ticket Type:
//1. Silver - Rs.200
//2. Gold - Rs.300
//3. Platinum - Rs.500
//4. Exit
//Enter your choice: 4
//Thank you! Visit Again.
