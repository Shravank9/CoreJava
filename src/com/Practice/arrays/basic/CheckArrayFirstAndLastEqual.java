package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArrayFirstAndLastEqual {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");

		int size = sc.nextInt();

		if (size < 1) {

			System.out.println("Array Element sShould be atleast 2");
			sc.close();
			return;

		}

		int[] arr = new int[size];
		System.out.println("Enter the elements of an array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		if (arr[0] == arr[arr.length - 1]) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		sc.close();

	}

}
//Given an array, check whether the first and last elements are equal.
//Print true if they are equal, otherwise print false.
//
//Input: [2, 5, 7, 2]
//Output: true
//
//Input: [2, 5, 7, 3]
//Output: false
//
//Required Loop: No loop required