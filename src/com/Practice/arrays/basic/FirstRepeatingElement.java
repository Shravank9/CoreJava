package com.Practice.arrays.basic;

import java.util.Scanner;

public class FirstRepeatingElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		if (size < 1) {
			System.out.println("Array Elemnts hsould contain atleast one");
			sc.close();
			return;
		}

		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		boolean found = true;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					found = false;
					System.out.println("The Element is the:" + arr[i]);
					break;
				}
			}
			if (!found) {
				break;
			}
		}

		if (found) {
			System.out.println("No repeating element");
		}

		sc.close();

	}

}

//Problem 52: Find the first repeating element in an array.
//Class Name: FirstRepeatingElement
//Required Loop: for loop
//
//Input:  [10, 5, 8, 5, 10, 8]
//Output: 10
//
//Input:  [4, 7, 2, 9, 7, 2]
//Output: 7
//
//Input:  [1, 2, 3, 4]
//Output: No repeating element
