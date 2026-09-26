package com.vcubelab_dailytest;

import java.util.Scanner;

public class SumOFNumber {

	static int issum(int a) {
		int sum = 0;

//		for (int i = a; a > 0; a=a/10) {
//			int r = a % 10;
//			sum += r;
//			
//		}

		while (a > 0) {
			int r = a % 10;
			sum += r;
			a /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a = sc.nextInt();

		int sum = issum(a);

		System.out.println("Sum Of The Digits:" + sum);

		sc.close();

	}

}

//
//Today's Assignment 
//
//Java 

//1.Find the sum of digits of a given number.
//Input: 168=>1+6+8
//Output: 15