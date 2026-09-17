package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArrayHasSameSignAdjacent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");

		int size = sc.nextInt();

		if (size < 2) {
			System.out.println("Array Elements Should contain Atleast 2!");
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

		boolean sign = false;

		while (start < end) {

			if (arr[start] > 0 && arr[start + 1] > 0) {
				sign = true;
				break;

			} else if (arr[start] < 0 && arr[start + 1] < 0) {
				sign = true;
				break;
			}
			start++;

		}
		if (sign) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		sc.close();

	}

}

//Given an array, check whether any two adjacent elements have theS same sign.
//Zero does not have a positive or negative sign and should not be considered.
//Print true if any adjacent non-zero elements have the same sign.
//Otherwise, print false.
//
//Input: [2, -3, 4, -5]
//Output: false
//
//Input: [2, 3, -4, 5]
//Output: true
//
//Required Loop: while loop
