package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArrayContainsOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");

		int size = sc.nextInt();

		if (size <= 0) {

			System.out.println("Array Elements should contain  Atleast 1");
			sc.close();
			return;
		}

		int[] arr = new int[size];
		System.out.println("Enter the elements of an array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		boolean odd = false;

		int start = 0;
		int end = arr.length;

		while (start < end) {

			if (Math.abs(arr[start]) % 2 == 1) {
				odd = true;
				break;
			}
			start++;
		}

		if (odd) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		sc.close();
	}

}
//Given an array, check whether the array contains at least one odd element.
//If at least one odd element is present, print true.
//If all elements are even, print false.
//
//Input: [2, 4, 6, 7, 10]
//Output: true
//
//Input: [2, 4, 6, 8, 10]
//Output: false