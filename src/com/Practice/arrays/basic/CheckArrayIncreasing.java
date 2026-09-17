package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArrayIncreasing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");

		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the elements of an array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int start = 0;
		int end = arr.length - 1;

		boolean increasing = true;

		while (start < end) {

			if (arr[start] >= arr[start + 1]) {
				increasing = false;
				break;
			}
			start++;
		}

		if (increasing) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		sc.close();
	}

}
//Given an array, check whether the elements are in strictly increasing order.
//Each element must be greater than the element before it.
//Print true if the array is strictly increasing, otherwise print false.
//
//Input: [1, 3, 5, 7, 9]
//Output: true
//
//Input: [1, 3, 5, 5, 9]
//Output: false
//
//Input: [1, 4, 2, 6]
//Output: false