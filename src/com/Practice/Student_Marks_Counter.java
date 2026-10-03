package com.Practice;

import java.util.Scanner;

public class Student_Marks_Counter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many students marks do you want to enter");
		int size = sc.nextInt();

		if (size <= 0) {
			System.out.println("Number of students must be greater than 0");
			sc.close();
			return;
		}
		int[] marks = new int[size];
		int count = 0;
		int highmarks = marks[0];
		for (int i = 0; i < size; i++) {
			marks[i] = sc.nextInt();
			if (marks[i] >= 40) {
				count++;
			}
			if (marks[i] > highmarks) {
				highmarks = marks[i];
			}
		}

		System.out.println("Count of Students  who scored the marks above 40 or equal to 40    : " + count);
		System.out.println("Count of Students  who scored the marks below 40                   : " + (size - count));
		System.out.println("Highest marks Scored is                                           :" + highmarks);

		sc.close();

	}

}
