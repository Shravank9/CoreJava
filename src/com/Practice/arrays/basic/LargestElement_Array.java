package com.Practice.arrays.basic;

import java.util.Scanner;

public class LargestElement_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int lar_element = arr[0];

		for (int n : arr) {
			if (lar_element < n) {
				lar_element = n;
			}
		}

		System.out.println("Largest: " + lar_element);
		sc.close();

	}

}

//Problem: Find the Largest Element
//
//Given an integer array, find and display the largest element.
//
//Input:
//5
//10 25 7 40 15
//
//Output:
//Largest: 40
