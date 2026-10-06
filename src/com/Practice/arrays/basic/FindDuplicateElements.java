package com.Practice.arrays.basic;

import java.util.Scanner;

public class FindDuplicateElements {

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

		for (int i = 0; i < arr.length; i++) {

			boolean alreadyAppeared = false;

			// Check whether arr[i] appeared before
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					alreadyAppeared = true;
					break;
				}
			}

			// Skip if this value was already processed
			if (alreadyAppeared) {
				continue;
			}

			// Check whether arr[i] appears again later
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}

		sc.close();

	}
}

//Problem:
//Given an integer array, find and print the elements
//that appear more than once.
//
//Example:
//Input: {10, 20, 10, 30, 20, 40}
//Output: 10 20
