package com.vcubelab_dailytest.opps.encapsulation;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		Scanner sc = new Scanner(System.in);
		Employee t = new Employee();

		System.out.println("Enter the ID of the Employee:");
		int a = sc.nextInt();
		System.out.println("Enter the Name of the Employee:");
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println("Enter the Salary :");
		double sal = sc.nextDouble();
		System.out.println("Enter the password:");
		sc.nextLine();
		String pass = sc.nextLine();

		t.setId(a);
		t.setName(s);
		t.setSal(sal);
		t.setPassword(pass);

		System.out.println("Employee ID:" + t.getId());
		System.out.println("Employee Name:" + t.getName());
		System.out.println("Employee Salary:" + t.getSal());
		System.out.println("Employee Password:" + t.getPassword());

		System.out.println("Main Ended Started");
		
		
		sc.close();

	}

}

//Today's Assignment
//
//Java-
//
//1.Create an encapsulated class Employee with private fields: id, name, salary, password.
//Requirements:
//1. Make all fields private (Data Hiding).
//2. Create public setters and getters.
//3. Access and modify the data
