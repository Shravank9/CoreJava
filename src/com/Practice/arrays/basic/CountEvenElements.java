package com.Practice.arrays.basic;

import java.util.Scanner;

public class CountEvenElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		if (size <= 0) {
			System.out.println("Array size mut be greater than zero");
			sc.close();
			return;
		}

		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int ecount = 0;

		for (int n : arr) {
			if (n % 2 == 0) {
				ecount++;
			}
		}
		int ocount = arr.length - ecount;

		System.out.println("Number of Even Numbers: " + ecount);
		System.out.println("Number of Odd Elements: " + ocount);

		sc.close();

	}

}

//Problem:
//Given an integer array, count and print the number of even elements.
//
//Example:
//Input:  {10, 5, 20, 3, 8, 7}
//Output: 3
//Problem:
//Given an integer array, count and print the number of odd elements.
//
//Example:
//Input:  {10, 5, 20, 3, 8, 7}
//Output: 3