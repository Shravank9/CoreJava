package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArrayAlternatingEvenOdd {

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

		boolean check = true;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {

				check = false;
				break;

			} else if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0) {

				check = false;
				break;

			}

		}
		if (check) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		sc.close();

	}

}
//Given an array, check whether even and odd elements appear alternately.
//The array can start with either an even or an odd element.
//Print true if the elements alternate between even and odd.
//Otherwise, print false.
//
//Input: [2, 5, 4, 7, 6]
//Output: true
//
//Input: [2, 5, 4, 7, 7]
//Output: false
//
//Required Loop: for loop