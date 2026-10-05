package com.Practice.arrays.basic;

import java.util.Scanner;

public class CountPositiveElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		if (size <= 0) {
			System.out.println("Array size must be greater than zero");
			sc.close();
			return;
		}

		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int count = 0;
		for (int n : arr) {
			if (n > 0) {
				count++;
			}
		}
		System.out.println("Number of Positive Elements:" + count);

		sc.close();
	}

}
//Problem:
//Given an integer array, count and print the number of positive elements.
//
//Example:
//Input:  {-5, 10, 0, 20, -3, 7}
//Output: 3
