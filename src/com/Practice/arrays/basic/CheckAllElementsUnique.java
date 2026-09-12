package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckAllElementsUnique {

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
		boolean found = false;

		while (start < arr.length) {

			int i = 0;

			while (i < arr.length) {
				if (arr[i] == arr[start] && i != start) {
					found = true;
					break;
				}
				i++;
			}
			start++;

			if (found) {
				break;
			}

		}

		if (!found) {
			System.out.print("True");

		} else {
			System.out.println("False");

		}

		sc.close();

	}

}
//Given an array, check whether all elements are unique.
//If any element appears more than once, print false.
//Otherwise, print true.
//
//Input: [1, 2, 3, 4, 5]
//Output: true
//
//Input: [1, 2, 3, 2, 5]
//Output: false
