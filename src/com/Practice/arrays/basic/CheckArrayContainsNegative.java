package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArrayContainsNegative {

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

		boolean negative = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negative = true;
				break;
			}

		}

		if (negative) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		sc.close();

	}

}
//Given an array, check whether the array contains at least one negative element.
//If at least one negative element is present, print true.
//If there are no negative elements, print false.
//
//Input: [2, 4, -3, 6, 8]
//Output: true
//
//Input: [2, 4, 3, 6, 8]
//Output: false
//
//Required Loop: for loop
