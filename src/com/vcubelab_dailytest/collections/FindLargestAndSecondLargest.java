package com.vcubelab_dailytest.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class FindLargestAndSecondLargest {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(25, 80, 45, 90, 60, 75, 90, 50));

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < num.size(); i++) {

			int a = num.get(i);
			if (a > largest) {
				secondLargest = largest;
				largest = a;
			} else if (a > secondLargest && a < largest) {
				secondLargest = a;

			}
		}
		System.out.println("Largest Element: " + largest);
		System.out.println("Second Largest Element: " + secondLargest);

	}

}
//Today’s Assignment 
//
//Java-
//
//1.Create two ArrayList<String> objects and store different fruit names in both lists.
//Delete one fruit, check whether "Apple" is available, keep only the common fruits in both lists, and print the final result.
//
//2.Create an ArrayList<Integer> with multiple integer values.
//Find and print the largest and second largest elements in the list.
//Input: [25, 80, 45, 90, 60, 75, 90, 50]
//Output: Largest Element: 90
//Second Largest Element: 80