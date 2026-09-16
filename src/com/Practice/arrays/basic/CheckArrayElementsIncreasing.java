package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArrayElementsIncreasing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");

		int size = sc.nextInt();

		if (size < 1) {

			System.out.println("Array Element sShould be atleast 1");
			sc.close();
			return;

		}

		int[] arr = new int[size];
		System.out.println("Enter the elements of an array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		boolean check = true;

		int start = 0, end = arr.length - 1;

		while (start < end) {

			if (arr[start] >= arr[start + 1]) {
				check = false;
				break;
			}
			start++;
		}

		if (check) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		sc.close();
	}

}

//Given an array, check whether every element is greater than the previous element.
//Print true if the array is strictly increasing, otherwise print false.
//
//Input: [1, 3, 5, 7]
//Output: true
//
//Input: [1, 3, 3, 7]
//Output: false
//
//Required Loop: while loop
