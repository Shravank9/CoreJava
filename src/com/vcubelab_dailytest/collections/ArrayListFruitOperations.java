package com.vcubelab_dailytest.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFruitOperations {

	public static void main(String[] args) {

		ArrayList<String> fruits1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango", "Orange", "Grapes"));

		ArrayList<String> fruits2 = new ArrayList<>(
				Arrays.asList("Banana", "Mango", "Pineapple", "Apple", "Watermelon"));

		System.out.println("\nBefore Operations:");
		System.out.println(fruits1);
		System.out.println(fruits2);

		fruits1.remove("Apple");
		fruits2.remove("Apple");

		System.out.println("\nAfter Operations:");
		System.out.println(fruits1);
		System.out.println(fruits2);

		System.out.println("\nApple available in fruits1: " + fruits1.contains("Apple"));
		System.out.println("\nApple available in fruits2: " + fruits2.contains("Apple"));

		fruits1.retainAll(fruits2);
		System.out.println("\nCommon fruits: " + fruits1);
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