package com.vcubelab_dailytest;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		if (size <= 0) {
			System.out.println("Array size mut be greater than zero");
			sc.close();
			return;
		}

		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		
		
		System.out.print("Unique Elements: ");

		for (int i = 0; i < arr.length; i++) {

			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}

			}
			if (!duplicate) {
				System.out.print(arr[i] + " ");
			}

		}

		sc.close();

	}

}

//Java-
//2.Remove Duplicate Elements from an Array
//Write a Java program to remove duplicate elements from an array and print only the unique elements.
//Input: 1 2 3 2 4 1 5
//Output: Unique Elements: 1 2 3 4 5