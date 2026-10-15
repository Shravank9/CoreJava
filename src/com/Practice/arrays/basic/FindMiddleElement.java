package com.Practice.arrays.basic;

import java.util.Scanner;

public class FindMiddleElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		if (size % 2 == 0) {
			System.out.println("The size of Array which is not Odd Numbers Of Elements");
			sc.close();
			return;
		}
		
		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int index = 0;

		int middle_element = (size / 2);
		for (int n : arr) {
			if (index == middle_element) {
				System.out.println(n + " ");
			}
			index++;
		}

		sc.close();
	}

}

//Problem:
//Given an integer array with an odd number of elements,
//find and print the middle element of the array.
//
//Example:
//Input:  {10, 20, 30, 40, 50}
//Output: 30
