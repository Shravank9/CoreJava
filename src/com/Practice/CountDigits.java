package com.Practice;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		a = Math.abs(a);
		int count = 0;
		if (a == 0)
			count = 1;
		for (; a > 0; a /= 10) {
			count++;

		}
		System.out.println("Number Of Digits:" + count);
		sc.close();

	}

}

//CCount the number of digits in a number
//
//Class name: CountDigits
//
//Input:
//
//Enter number: 12345
//
//Expected output:
//
//Number of digits = 5
