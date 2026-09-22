package com.vcubelab_dailytest.exceptions.task22_09_26;

import java.util.Scanner;

public class Passengerbooking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of passengers:");
		int numberOfPassengers = Integer.parseInt(sc.nextLine());

		Object[] passengers = new Object[numberOfPassengers];

		// Taking passenger details
		for (int i = 0; i < numberOfPassengers; i++) {

			System.out.println("\nEnter details for Passenger " + (i + 1));

			System.out.println("Enter Passenger ID:");
			String id = sc.nextLine();

			System.out.println("Enter Age:");
			String age = sc.nextLine();

			System.out.println("Enter Seat Number:");
			String seat = sc.nextLine();

			passengers[i] = new Object[] { id, age, seat };
		}

		// 1. Convert Passenger ID and Age to numbers
		try {
			Object[] passenger = (Object[]) passengers[0];

			int id = Integer.parseInt((String) passenger[0]);
			int age = Integer.parseInt((String) passenger[1]);

			System.out.println("\nConverted Passenger ID: " + id);
			System.out.println("Converted Age: " + age);

		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException: ID or Age is not a valid number.");
		}

		// 2. Calculate average baggage
		try {
			double totalBaggage = 100.0;

			double averageBaggage = totalBaggage / numberOfPassengers;

			System.out.println("\nAverage Baggage: " + averageBaggage);

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: Cannot divide by zero.");
		}

		// 3. Search a passenger using an array index
		try {
			int searchIndex = 5;

			Object[] passenger = (Object[]) passengers[searchIndex];

			System.out.println("\nPassenger found:");
			System.out.println("ID: " + passenger[0]);
			System.out.println("Age: " + passenger[1]);
			System.out.println("Seat: " + passenger[2]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: Passenger index does not exist.");
		}

		// 4. Cast an Object value to the expected type
		try {
			Object value = passengers[0];

			String seat = (String) value;

			System.out.println("\nSeat: " + seat);

		} catch (ClassCastException e) {
			System.out.println("ClassCastException: Object cannot be converted to String.");
		}

		// 5. Perform an operation on passenger data that may be null
		try {
			String passengerName = null;

			System.out.println("\nPassenger Name Length: " + passengerName.length());

		} catch (NullPointerException e) {
			System.out.println("NullPointerException: Passenger data is null.");
		}

		// 6. Calculate booking average
		try {
			double totalAmount = 5000.0;
			int totalSeats = 0;

			double bookingAverage = totalAmount / totalSeats;

			System.out.println("\nBooking Average: " + bookingAverage);

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: Cannot divide by zero.");
		}
		
		System.out.println("hi");

		sc.close();
	}
}
//JAVA
//1.Develop a Java program to process a passenger booking.
//The system receives:
//Passenger ID and age as String
//Seat number as String
//Number of passengers
//Passenger details in an array
//Different passenger data using Object[]
//Perform these operations using multiple separate try-catch blocks:
//Convert passenger ID and age to numbers.
//Calculate average baggage: Total Baggage / Number of Passengers.
//Search a passenger using an array index.
//Cast an Object value to the expected type.
//Perform an operation on passenger data that may be null.
//Calculate booking average: Total Amount / Number of Seats.
//Handle: NumberFormatException, ArithmeticException, ArrayIndexOutOfBoundsException,
//StringIndexOutOfBoundsException, ClassCastException, and NullPointerException.
//Condition: Use separate try-catch blocks and ensure the program continues after an exception.
