package com.vcubelab_dailytest;

import java.util.Scanner;

public class Perfect_Number_WithinRange {

	void perfectnumber(int a, int b) {

		for (int i = a; i <= b; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.print(i + " ");
			}

		}

	}

	void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number where you want start it");
		int a = sc.nextInt();

		System.out.println("Enter the number where you end it");
		int b = sc.nextInt();

		perfectnumber(a, b);
		sc.close();
	}

}
//Today's Assignment 
//
//Java 
//1.write a java program to print the perfect number between the range 1 to 100.