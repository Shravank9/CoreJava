package com.vcubelab_dailytest;

import java.util.Scanner;

public class LeaderNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the size of Array");
		int size = sc.nextInt();

		System.out.printf("Enter the elements of matrix which %d  ", size);

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {
			boolean leader = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					leader = false;
					break;
				}
			}
			if(leader) {
				System.out.println(arr[i]+" ");
			}
		}

		sc.close();

	}

}

//Today's Assignment
//Java-
//1.Write a Java program to find all the leader elements in an array of integers.
//A leader element is an element that is greater than all the elements to its right. The last element of the array is always considered a leader.
//Input: 16 17 4 3 5 2
//Output: Leader Elements: 17 5 2
//