package com.vcubelab_dailytest.Strings;

import java.util.Scanner;

public class LongestAndSecondLongestWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Strings: ");
		String str = sc.nextLine();

		String[] words = str.split(" ");

		int largest = 0, smallest = 0;
		int largeindex = 0;
		int smallindex = 0;

		for (int i = 0; i < words.length; i++) {

			if (words[i].length() > largest) {

				smallindex = largeindex;
				smallest = largest;
				largest = words[i].length();
				largeindex = i;

			} else if (smallest < largest && words[i].length() >smallest) {

				smallest = words[i].length();
				smallindex = i;

			}
		}

		System.out.println("Longest -> " + words[largeindex] + " the lengths is ->" + largest + " , " + "Second -> "
				+ words[smallindex] + " the lengths is ->" + smallest);

		sc.close();

	}

}
//Today's Assignment 
//
//Java
//1. Occurrence of Each Character in a String
//Example: Input: "banana" → Output: {"b":1, "a":3, "n":2}
//2.find Longest and Second Longest Word with Length in a string sentence.
//Example: Input: "I love programming and debugging" → Longest:
//"programming" (11), Second: "debugging" (9)