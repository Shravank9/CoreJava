package com.vcubelab_dailytest.oopstask6;

import java.util.Scanner;

public class AttendanceDemo{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("which one do u want to select attendance? ");
			System.out.println("!)Developer \n2)Tester \n3)Manager \n4)Exit");

			System.out.println("Enter the choice :");
			int choice = sc.nextInt();

			Attendance a = null;

			switch (choice) {
			case 1 -> {
				a = new Developer();
				a.markAttendance();
			}
			case 2 -> {
				a = new Tester();
				a.markAttendance();
			}

			case 3 -> {
				a = new Manager();
				a.markAttendance();

			}
			case 4 -> {
				System.out.println("Sucessfuly exited!");
				sc.close();
				return;
			}
			default -> {
				System.out.println("Invalid selection or choice");
				sc.close();
				return;
			}

			}

		}
	}

}
//Today's Assignment
//Java-
//1.A company records attendance for different employees.
//Create an interface Attendance with method markAttendance().
//Implement Developer, Tester, and Manager.
//Display attendance messages with employee roles.