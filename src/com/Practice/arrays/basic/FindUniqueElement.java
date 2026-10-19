package com.Practice.arrays.basic;

import java.util.Scanner;

public class FindUniqueElement {

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
				if (arr[i] == arr[j] && i != j) {
					count++;
				}

			}
			if (count < 1) {
				System.out.print(arr[i] + " ");
			}
		}

		sc.close();

	}

}
//Given an array where every element appears exactly twice
//except one element, find the element that appears only once.
//[4, 2, 1, 2, 1]
//	Unique element: 4