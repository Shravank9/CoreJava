package com.Practice.arrays.basic;

import java.util.Scanner;

public class RotateArrayRight {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		System.out.println("Enter  Array Elements");
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Enter the element where u wnat to start");
		int start = sc.nextInt();

		for (int i = arr.length - start; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (i == arr.length - 1) {
				for (int j = 0; j < arr.length - start; j++) {
					System.out.print(arr[j] + " ");
				}
			}
		}

		sc.close();

	}

}

//Enter array size: 6
//
//Enter array elements:
//10 20 30 40 50 60
//
//Enter k:
//3
//[40, 50, 60, 10, 20, 30]
