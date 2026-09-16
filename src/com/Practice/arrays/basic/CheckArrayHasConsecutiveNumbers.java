package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArrayHasConsecutiveNumbers {

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

		boolean differ = true;
		while (start < end) {

			if (Math.abs((long) arr[start] - arr[start + 1]) != 1) {
				differ = false;
				break;
			}
			start++;
		}

		if (differ) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		sc.close();
	}

}
//Given an array, check whether every adjacent element differs by exactly 1.
//The numbers can be increasing or decreasing by 1.
//Print true if the condition is satisfied for the entire array.
//Otherwise, print false.
//
//Input: [5, 6, 7, 8, 9]
//Output: true
//
//Input: [9, 8, 7, 6, 5]
//Output: true
//
//Input: [1, 2, 4, 5]
//Output: false
//
//Required Loop: while loop