package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArrayHasEqualAdjacentElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");

		int size = sc.nextInt();

		if (size <= 0) {

			System.out.println("Array Elements should be atleast 1!");
			sc.close();
			return;
		}

		int[] arr = new int[size];
		System.out.println("Enter the elements of an array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int start = 0;
		int end = arr.length - 1;

		boolean adjacent = false;

		while (start < end) {

			if (arr[start] == arr[start + 1]) {
				adjacent = true;
				break;

			}
			start++;

		}
		
		if (adjacent) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		sc.close();

	}

}
//Given an array, check whether any two adjacent elements are equal.
//If any adjacent elements are equal, print true.
//Otherwise, print false.
//
//Input: [1, 2, 3, 3, 5]
//Output: true
//
//Input: [1, 2, 3, 4, 5]
//Output: false
//
//Required Loop: while loop