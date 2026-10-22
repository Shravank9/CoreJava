package com.vcubelab_dailytest;
import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:  ");
		int a = sc.nextInt();
		if (isprime(a)) {
			System.out.print(a + " is a prime number");
		} else {
			System.out.print(a + " is  not a prime number");
		}
		sc.close();

	}

	static boolean isprime(int a) {
		boolean status = true;
		if (a == 0 || a == 1) {
			return false;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

}

//
//Today's Assignment
//Java
//1.write a java program to print given number is prime or not.
//
