package com.Practice.arrays.basic;

import java.util.Scanner;

public class FindSmallestPositiveElement {

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

		boolean found = false;

		int small = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0 && arr[i] < small) {

				small = arr[i];
				found = true;

			}

		}

		if (found) {
			System.out.println("Smallest positive element:" + small);
		} else {
			System.out.println("No positive element");
		}

		sc.close();

	}

}
//Given an array, find the smallest positive element.
//Ignore zero and negative elements.
//If the array contains no positive element, print a suitable message.
//
//Input: [-5, 3, -2, 7, 1, 0]
//Output: Smallest positive element: 1
//
//Input: [-5, -2, 0, -8]
//Output: No positive element
//
//Required Loop: for loop