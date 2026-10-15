package com.Practice.arrays.basic;

import java.util.Scanner;

public class FindLastElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		if (arr.length > 0) {
			System.out.println("Last Element: " + arr[arr.length - 1]);
		} else {
			System.out.println("Array is empty.");
		}
		sc.close();

	}

}

//Problem: Find the Last Element
//
//Given an integer array, find and display the Last element.
//
//Input:
//5
//10 20 30 40 50
//
//Output:
//Last Element: 50
//
//Time Complexity: O(1)
//Space Complexity: O(n)
