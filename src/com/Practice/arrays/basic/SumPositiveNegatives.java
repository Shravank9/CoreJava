package com.Practice.arrays.basic;

import java.util.Scanner;

public class SumPositiveNegatives {

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

		int psum = 0;
		int nsum = 0;

		for (int n : arr) {
			if (n > 0) {
				psum += n;
			} else if (n < 0) {
				nsum += n;
			}
		}

		System.out.println("Positive Sum: " + psum);
		System.out.println("Negative Sum: " + nsum);

		sc.close();
	}

}

//Problem:
//Given an integer array, calculate and print the sum of all positive elements.
//
//Example:
//Input: {-5, 10, 20, -3, 7, 0}
//Output: 37
