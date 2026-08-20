package com.Practice.arrays.basic;

import java.util.Scanner;

public class FindSecondSmallestElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();

		if (size < 2) {
			System.out.println("Array Elemnts must be atleast two");
			sc.close();
			return;

		}

		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int first_smallest = arr[0];
		int second_smallest = Integer.MAX_VALUE;

		for (int n : arr) {
			if (n < first_smallest) {
				second_smallest = first_smallest;
				first_smallest = n;
			} else if (n < second_smallest && n > first_smallest) {
				second_smallest = n;
			}
		}
		System.out.println("Second Smallest Element: " + second_smallest);

		sc.close();

	}

}
//Problem:
//Given an integer array, find and print the second smallest element in the array.
//
//Example:
//Input:  {10, 25, 7, 40, 15}
//Output: 10
