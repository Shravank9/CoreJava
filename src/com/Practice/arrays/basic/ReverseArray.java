package com.Practice.arrays.basic;

import java.util.Arrays;
import java.util.Scanner;


public class ReverseArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

//		String s = "";
//		for (int a : arr) {
//			s = a + " " + s;
//		}
//		
//		s = "[" + s.substring(0, s.length() - 2) + "]";
//		System.out.println(s);

		int reverse_arr[] = new int[size];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			reverse_arr[index++] = arr[i];
		}
		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Reversed Array: " + Arrays.toString(reverse_arr));

		sc.close();

	}

}
//Problem: Reverse an Array
//
//Given an integer array, reverse the elements
//and display the reversed array.
//
//Input:
//5
//10 20 30 40 50
//
//Output:
//Reversed Array: [50, 40, 30, 20, 10]
//
//Time Complexity: O(n)
//Space Complexity: O(n)