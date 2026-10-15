package com.Practice.arrays.basic;

import java.util.Scanner;

public class FindMaximumDifference {

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

		int max = arr[0];
		int min = arr[0];

		for (int n : arr) {

			if (n > max) {
				max = n;
			} else if (n < min) {
				min = n;

			}
		}

		int maxdifference = max - min;

		System.out.println("Maximum Difference : " + maxdifference);

		sc.close();

	}

}
//Problem:
//Given an integer array, find and print the maximum difference
//between any two elements.
//
//Example:
//Input:  {10, 3, 15, 7, 2}
//Output: 13
