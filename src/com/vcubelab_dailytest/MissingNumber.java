package com.vcubelab_dailytest;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the array Elemnts of it");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int x : arr) {
			sum += x;
		}

		int n = size + 1;
		int sum1 = n * (n + 1) / 2;
		System.out.println("Missing Number:" + (sum1 - sum));
		
		
		sc.close();

	}

}

//Java-
//1.Find the Missing Number from 1 to N
//A sorted array contains numbers from 1 to N, but one number is missing.
//Write a Java program to find the missing number.
//Input: 1 2 4 5 6
//Output: Missing Number = 3
