package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArrayContainsOnlyEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");

		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the elements of an array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		boolean even = true;

		for (int i = 0; i < arr.length; i++) {

			if (Math.abs(arr[i]) % 2 == 0) {
				even = false;
				break;
			}

		}

		if (even) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		sc.close();

	}

}
//Given an array, check whether all elements in the array are even.
//If every element is even, print true.
//If at least one element is odd, print false.
//
//Input: [2, 4, 6, 8, 10]
//Output: true
//
//Input: [2, 4, 7, 8, 10]
//Output: false
