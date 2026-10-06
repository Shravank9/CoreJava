package com.Practice.arrays.basic;

import java.util.Scanner;

public class EquilibriumIndex {

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
		boolean found = false;
		int totalsum = 0;

		for (int i = 0; i < arr.length; i++) {
			totalsum += arr[i];
		}
		int leftsum = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			int rightSum = totalsum - leftsum - arr[i];

			if (leftsum == rightSum) {
				System.out.println("Equilibrium Index: " + i);
				found = true;
				break;
			}

			leftsum += arr[i];
		}

		if (!found) {
			System.out.println("No equilibrium index");
		}

		sc.close();

	}

}
//Topic: 1D Arrays — Medium
//Problem 55: Find the equilibrium index of an array.
//Class Name: EquilibriumIndex
//Required Loop: for loop
//
//An equilibrium index is an index where the sum of elements
//on the left side is equal to the sum of elements on the right side.
//
//Input:  [-7, 1, 5, 2, -4, 3, 0]
//Output: Equilibrium Index = 3
//
//Explanation:
//Left sum  = -7 + 1 + 5 = -1
//Right sum = -4 + 3 + 0 = -1
//
//Input:  [1, 2, 3]
//Output: No equilibrium index
//
