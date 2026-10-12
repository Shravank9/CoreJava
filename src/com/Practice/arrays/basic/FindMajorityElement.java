package com.Practice.arrays.basic;

import java.util.Scanner;

public class FindMajorityElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");

		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the elements of an array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] ) {
					count++;
				}

			}
			if (count >arr.length/2) {
				System.out.print(arr[i] + " ");
				break;
			}
		}

		sc.close();

	}

}
//Given an array, find the element that appears more than n/2 times.
//You can assume that a majority element always exists.
//
//Input: [2, 2, 1, 1, 1, 2, 2]
//Output: Majority element: 2
