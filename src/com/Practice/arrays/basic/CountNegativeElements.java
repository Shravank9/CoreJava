package com.Practice.arrays.basic;

import java.util.Scanner;

public class CountNegativeElements {

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

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				count++;
			}
		}

		System.out.println("Number of Negative Numbers: " + count);

		sc.close();

	}

}
//Problem:
//Given an integer array, count and print the number of negative elements.
//
//Example:
//Input:  {10, -5, 20, -3, 0, -7}
//Output: 3