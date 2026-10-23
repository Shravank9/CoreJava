package com.Practice.arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

public class PrintOddIndexElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int[] odd = new int[Math.round(size / 2)];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				odd[index++] = arr[i];
			}
		}
		System.out.println("Elements at odd indexes: " + Arrays.toString(odd));

//
//		int index1 = 0;
//		for (int n : arr) {
//			if (index1 % 2 != 0) {
//				System.out.print(n + " ");
//			}
//			index1++;
//		}
//		System.out.println();
//		
//		for(int i=0;i<arr.length;i++) {
//			if(i%2!=0) {
//				System.out.print(arr[i]+" ");
//			}
//		}

		sc.close();
	}

}

//Problem: Print Elements at Odd Indexes
//
//Given an integer array, print all elements
//that are present at odd indexes.
//
//Input:
//6
//10 20 30 40 50 60
//
//Output:
//Elements at odd indexes: [20, 40, 60]
//
//Time Complexity: O(n)
//Space Complexity: O(n)
