package com.Practice.arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

public class PrintEvenIndexElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

//		int[] even = new int[Math.round((size + 1) / 2)];
//		int index=0;
//		for(int i=0;i<arr.length;i++) {
//			if(i%2==0) {
//				even[index++]=arr[i];
//			}
//		}
//		System.out.println("Elements at even indexes: "+Arrays.toString(even));


//		int index1 = 0;
//		for (int n : arr) {
//			if (index1 % 2 == 0) {
//				System.out.print(n + " ");
//			}
//			index1++;
//		}
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i]+" ");
			}
		}

		sc.close();

	}

}

//Problem: Print Elements at Even Indexes
//
//Given an integer array, print all elements
//that are present at even indexes.
//
//Input:
//6
//10 20 30 40 50 60
//
//Output:
//Elements at even indexes: [10, 30, 50]
//
//Time Complexity: O(n)
//Space Complexity: O(n)
