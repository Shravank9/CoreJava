package com.Practice.arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputOutput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of the Array:");
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.printf("Enter %d array elements:%n", size);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}

		// or we can print another way also by using method in arrays class
		System.out.println();
		System.out.println(Arrays.toString(arr));

		sc.close();

	}

}

//Problem: Read and Display Array
//
//Given an integer array, take the array size and elements
//from the user and display all the elements.
//
//Input:
//5
//10 20 30 40 50
//
//Output:
//Array: [10, 20, 30, 40, 50]
