package com.Practice.arrays.basic;

import java.util.Scanner;

public class MostFrequentElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		if (size <= 0) {
			System.out.println("Array size mut be greater than zero");
			sc.close();
			return;
		}

		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		boolean found = true;

		int maxCount = 0;
		int element = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 0;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					found = false;
					count++;
				}

			}
			if (count > maxCount) {
				maxCount = count;
				element = arr[i];

			}
		}

		if (found) {
			System.out.println("No element repeats");
		} else {
			System.out.println("Most frequent element: " + element);
		}

		sc.close();
	}

}
//Problem 53: Find the element that occurs the most times in an array.
//Class Name: MostFrequentElement
//Required Loop: for loop
//
//Input:  [2, 3, 2, 5, 2, 3]
//Output: 2
//
//Input:  [1, 4, 4, 2, 1, 4]
//Output: 4
//
//Input:  [5, 6, 7, 8]
//Output: No element repeats
//
//Edge Cases:
//[5]
//[5, 5, 5]
//[1, 2, 1, 2]
//[-2, -2, 3, 3, 3]
//[0, 0, 1, 2]