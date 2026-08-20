package com.Practice.arrays.basic;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int even_count = 0, odd_count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
		}

		System.out.println("Even: " + even_count);
		System.out.println("Odd: " + odd_count);

		sc.close();
	}

}

//Problem: Count Even and Odd Elements
//
//Given an integer array, count how many elements are even
//and how many elements are odd.
//
//Input:
//7
//10 15 8 7 20 3 12
//
//Output:
//Even: 4
//Odd: 3
//
//Time Complexity: O(n)
//Space Complexity: O(n)
