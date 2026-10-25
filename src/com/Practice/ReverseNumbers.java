package com.Practice;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		while (a > 0) {
			System.out.print(a + " ");
			a--;
		}
		sc.close();
	}

}

//1. Print numbers from 10 to 1
//
//Class name: ReverseNumbers
//
//Expected output:
//
//10 9 8 7 6 5 4 3 2 1