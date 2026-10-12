package com.Practice.arrays.basic;

import java.util.Scanner;

public class FindLargestNegativeElement {

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

		int larneg = Integer.MIN_VALUE;

		int start = 0;
		int end = arr.length;
		
		boolean found = false;

		while (start < end) {

			if (larneg < arr[start] && arr[start] < 0) {
				larneg = arr[start];
				found=true;
			}
			start++;
		}

		if (!found) {
			System.out.println("No negative element");
		} else {
			System.out.println("Largest negative element:" + larneg);
		}

		sc.close();

	}

}

//Given an array, find the largest negative element.
//Ignore zero and positive elements.
//If the array contains no negative element, print a suitable message.
//
//Input: [4, -8, -2, 7, -5]
//Output: Largest negative element: -2
//
//Input: [2, 5, 0, 8]
//Output: No negative element
//
//Required Loop: while loop
