package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArrayContainsDuplicate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");

		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the elements of an array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		boolean duplicate = false;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					duplicate = true;
					break;

				}
			}
			if (duplicate) {
				break;
			}
		}

		if (duplicate) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		sc.close();
	}

}
//Given an array, check whether the array contains at least one duplicate element.
//If any element appears more than once, print true.
//If every element appears only once, print false.
//
//Input: [1, 2, 3, 4, 5]
//Output: false
//
//Input: [1, 2, 3, 2, 5]
//Output: true