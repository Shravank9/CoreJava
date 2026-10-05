package com.Practice.arrays.basic;

import java.util.Scanner;

public class CountOccurrences {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the Number to find its Occurrence:");
		int search = sc.nextInt();
		int count = 0;

		for (int n : arr) {
			if (search == n) {
				count++;
			}
		}
		System.out.println("Occurrences: " + count);

		sc.close();
	}

}

//Problem: Count Occurrences of an Element
//
//Given an integer array and a number,
//count how many times that number appears in the array.
//
//Input:
//7
//10 20 10 30 10 40 20
//10
//
//Output:
//Occurrences: 3
//
//Time Complexity: O(n)
//Space Complexity: O(n)
