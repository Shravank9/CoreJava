package com.vcubelab_dailytest;

import java.util.Scanner;

public class Happy_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a = sc.nextInt();
		boolean happy = happynumber(a);
		if (happy) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not an Happy Number");
		}

		sc.close();

	}

	private static boolean happynumber(int a) {
		boolean status = false;

		while (a > 9) {
			int sum = 0;
			while (a > 0) {
				int r = a % 10;
				sum += Math.powExact(r, 2);
				a /= 10;
			}
			a = sum;

		}
		if (a == 1)
			status = true;
		return status;
	}

}

//1.Write a Java program to check whether a given number is a Happy Number.
//definition - A Happy Number is a number where the repeated sum of the squares of its digits eventually becomes 1.
//Input - 19 =>1² + 9² = 82
//         8² + 2² = 68
//         6² + 8² = 100
//         1² + 0² + 0² = 1
//Output - Happy Number
