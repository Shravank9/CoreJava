package com.Practice.arrays.basic;

import java.util.Scanner;

public class FindElementIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the Number to find its Index:");
		int a = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				System.out.println("Element Found at Index:" + i);
				sc.close();
				return;

			}
		}

		System.out.println("Element Not Found at any Index");

		sc.close();

	}

}

//Problem: Find the Index of an Element
//
//Given an integer array and a number to search,
//find and display the index of that number.
//
//Input:
//5
//10 20 30 40 50
//30
//
//Output:
//Element found at index: 2
//
//Time Complexity: O(n)
//Space Complexity: O(n)
