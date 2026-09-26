package com.Practice.arrays.basic;

import java.util.Scanner;

public class SmallestElement_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		
		if (size <= 0) {
		    System.out.println("Array size must be greater than 0.");
		    sc.close();
		    return;
		}
		
		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int small_element = arr[0];

		for (int n : arr) {
			
			if (small_element > n) {
				small_element = n;
			}
		}

		System.out.println("Smallest: " + small_element);

		sc.close();

	}

}

//Problem: Find the Smallest Element
//
//Given an integer array, find and display the smallest element.
//
//Input:
//5
//10 25 7 40 15
//
//Output:
//Smallest: 7
