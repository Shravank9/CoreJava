package com.Practice.arrays.basic;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the number to check in the given array or not");
		int a = sc.nextInt();
		boolean status = false;

		for (int n : arr) {
			if (a == n) {
				System.out.println("Element Found ");
				status=true;
				break;
			}
		}

		if (!status) {
			System.out.println("Element is Not Found");
		}

		sc.close();
	}

}

//Problem: Search for an Element
//Given an integer array and a number to search,
//check whether the number is present in the array.
//
//Input:
//5
//10 20 30 40 50
//30
//
//Output:
//Element found
//
//Time Complexity: O(n)
//Space Complexity: O(n)