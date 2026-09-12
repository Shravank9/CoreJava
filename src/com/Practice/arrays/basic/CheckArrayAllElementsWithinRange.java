package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArrayAllElementsWithinRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");

		int size = sc.nextInt();

		if (size < 1) {
			System.out.println("Array Elements should be Atleast 2");
			sc.close();
			return;

		}

		int[] arr = new int[size];
		System.out.println("Enter the elements of an array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the value of Minimum Value");
		int min = sc.nextInt();

		System.out.println("Enter the Value of Maximum Value");
		int max = sc.nextInt();

		if (min > max) {

			System.out.println("Invalid range!");
			sc.close();
			return;
		}

		boolean check = true;

		int start = 0;
		int end = arr.length;

		while (start < end) {

			if (!(arr[start] >= min && arr[start] <= max)) {

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
//Given an array and two values min and max, check whether every element
//in the array is within the inclusive range [min, max].
//Print true if all elements are within the range, otherwise print false.
//
//Input: arr = [3, 5, 7, 9], min = 3, max = 9
//Output: true
//
//Input: arr = [3, 5, 10, 9], min = 3, max = 9
//Output: false
//
//Required Loop: while loop
