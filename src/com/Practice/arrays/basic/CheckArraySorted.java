package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArraySorted {

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

//		boolean sorted = true;
//		int previous = arr[0];

//		for (int n : arr) {
//			if (n < previous) {
//				sorted = false;
//		        System.out.println("Array is  Not Sorted");
//				break;
//			}
//			previous = n;
//		}
//		System.out.println("Array is  Sorted");

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < arr[i - 1]) {
				System.out.println("Array is  Not Sorted");
				sc.close();
				return;
			}
		}
		System.out.println("Array is  Sorted");

		sc.close();

	}

}
//Problem:
//Given an integer array, check whether the array is sorted
//in ascending order.
//
//Example:
//Input: {10, 20, 30, 40, 50}
//Output: Array is sorted
//
//Example:
//Input: {10, 30, 20, 40, 50}
//Output: Array is not sorted
