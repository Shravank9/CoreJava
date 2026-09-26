package com.vcubelab_dailytest;

import java.util.Scanner;

public class SumOf_EvenNumbers {

	public static int evensum(int a, int b) {
		int esum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				esum += i;
			}

		}

		return esum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number where you want start it");
		int a = sc.nextInt();

		System.out.println("Enter a Number where you want stop it");
		int b = sc.nextInt();

		int c = evensum(a, b);

		System.out.println("Sum Of the Even Numbers:" + c);
		sc.close();

	}

}

//Today's Assignment 
//Java 
//1.Find the sum of all even numbers from 1 to 100