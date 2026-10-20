package com.Practice.arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {

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

		int temp = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] == 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

		System.out.println(Arrays.toString(arr));

		sc.close();
	}

}
//Problem:
//
//Given an integer array, move all zero elements to the end
//while maintaining the relative order of the non-zero elements.
//
//Example:
//
//Input: {1, 0, 3, 0, 5, 2}
//
//Output: {1, 3, 5, 2, 0, 0}
