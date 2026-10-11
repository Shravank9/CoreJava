package com.Practice.arrays.basic;

import java.util.Scanner;

public class FindElementFrequency {

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

		System.out.println("Enter the Target:");
		int a = sc.nextInt();
		int count = 0;

		for (int n : arr) {
			if (a == n) {
				count++;
			}
		}
		System.out.println("Count :" + count);

		sc.close();

	}

}
//Problem:
//Given an integer array and a target element,
//find and print how many times the target element occurs in the array.
//
//Example:
//Input: {10, 20, 10, 30, 10, 40}
//Target: 10
//Output: 3
