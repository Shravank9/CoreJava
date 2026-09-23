package com.Practice.arrays.basic;

import java.util.Scanner;

public class CheckArrayPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");

		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the elements of an array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int j = arr.length - 1;
		boolean palindrome = true;

		for (int i = 0; i < arr.length / 2; i++) {

			if (arr[i] != arr[j]) {
				palindrome = false;
			}
			j--;

		}
		
		if (palindrome) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		sc.close();
	}

}
//Given an array, check whether the array is a palindrome.
//A palindrome array reads the same from left to right and right to left.
//Print true if the array is a palindrome, otherwise print false.
//
//Input: [1, 2, 3, 2, 1]
//Output: true
//
//Input: [1, 2, 3, 4, 5]
//Output: false