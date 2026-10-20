package com.Practice.arrays.basic;

import java.util.Scanner;

public class LongestIncreasingSubarray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		if (size < 1) {
			System.out.println("Array Elemnts hsould contain atleast Two");
			sc.close();
			return;
		}

		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int current = 1;
		int maxsub = 1;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] < arr[i + 1]) {
				current++;
			} else {
				current = 1;
			}

			if (current > maxsub) {
				maxsub = current;
			}

		}
		System.out.println("Length: " + maxsub);

		sc.close();
	}

}
//Topic: 1D Arrays — Medium Logic
//Problem 56: Find the longest continuous increasing subarray.
//Class Name: LongestIncreasingSubarray
//Required Loop: for loop
//
//Find the length of the longest continuous part of the array
//where every next element is greater than the previous element.
//
//Input:  [1, 2, 3, 2, 4, 5, 6, 1]
//Output: Length = 4
//
//Explanation:
//[4, 5, 6] is the longest continuously increasing subarray.
//
//Input:  [5, 4, 3, 2, 1]
//Output: Length = 1
//
//Input:  [1, 2, 3, 4]
//Output: Length = 4
