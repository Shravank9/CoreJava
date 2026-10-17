package com.Practice.arrays.basic;

import java.util.Scanner;

public class FindSecondLargestElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();

		if (size < 2) {
			System.out.println("Array must contain at least 2 elements.");
			sc.close();
			return;
		}

		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int first_Largest = arr[0];
		int second_Largest = Integer.MIN_VALUE;
		
		for (int n : arr) {
			if (n > first_Largest) {
				second_Largest = first_Largest;
				first_Largest = n;
			} else if (n < first_Largest && n > second_Largest) {
				second_Largest = n;
			}
		}
		System.out.println("Second Largest Element:" + second_Largest);

		sc.close();
	}

}
//Problem:
//Given an integer array, find and print the second largest element in the array.
//
//Example:
//Input:  {10, 25, 7, 40, 15}
//Output: 25