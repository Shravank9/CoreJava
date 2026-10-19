package com.Practice.arrays.basic;

import java.util.Scanner;

public class FirstOccurrenceIndex {

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

		System.out.println("Enter the search Element");
		int search = sc.nextInt();

		boolean found = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == search) {
				found = true;
				System.out.println("The element is :" + i);
				break;
			}

		}

		if (!found) {
			System.out.println(" Element not found");
		}

		sc.close();

	}

}
//Problem 54: Find the index of the first occurrence of a given element.
//Class Name: FirstOccurrenceIndex
//Required Loop: for loop
//
//Input Array: [10, 20, 30, 20, 40]
//Search Element: 20
//Output: Index = 1
//
//Input Array: [5, 8, 12, 15]
//Search Element: 7
//Output: Element not found
