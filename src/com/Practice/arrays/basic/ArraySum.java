package com.Practice.arrays.basic;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.printf("Enter %d array elements:%n", size);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int arr_sum=0;
		for(int a:arr) {
			arr_sum+=a;
			
		}
		System.out.println("Sum: "+arr_sum);
		sc.close();
	}

}

//Problem: Find the Sum of Array Elements
//
//Given an integer array, find and display the sum
//of all elements.
//
//Input:
//5
//10 20 30 40 50
//
//Output:
//Sum: 150

