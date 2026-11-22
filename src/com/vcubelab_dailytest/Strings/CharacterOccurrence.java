package com.vcubelab_dailytest.Strings;

import java.util.Scanner;

public class CharacterOccurrence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String str = sc.next();

		int[] str1 = new int[256];

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			str1[c]++;

		}
		for (int i = 0; i < str.length(); i++) {

			if (i == str.indexOf(str.charAt(i))) {

				System.out.print(str.charAt(i) + " -> " + str1[str.charAt(i)] + ", ");
			}
		}

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