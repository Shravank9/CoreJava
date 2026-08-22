package com.Practice.arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int[] copy = new int[arr.length];
//		int index=0;
//		
//		for(int n:arr) {
//			copy[index++]=n;
//		}

		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		System.out.println("Orginal Array: " + Arrays.toString(arr));
		System.out.println("Copied Array: " + Arrays.toString(copy));

		sc.close();

	}

}

//Problem: Copy an Array
//
//Given an integer array, copy all its elements
//into another array and display both arrays.
//
//Input:
//5
//10 20 30 40 50
//
//Output:
//Original Array: [10, 20, 30, 40, 50]
//Copied Array: [10, 20, 30, 40, 50]
//
//Time Complexity: O(n)
//Space Complexity: O(n)
