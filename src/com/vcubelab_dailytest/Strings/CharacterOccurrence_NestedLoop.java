package com.vcubelab_dailytest.Strings;

import java.util.Scanner;

public class CharacterOccurrence_NestedLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {

			int count = 0;

			boolean alreadyCounted = false;

			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == str.charAt(j)) {

					alreadyCounted = true;
					break;

				}
			}

			if (!alreadyCounted) {
				for (int k = 0; k < str.length(); k++) {

					if (str.charAt(i) == str.charAt(k)) {
						count++;
					}
				}

				System.out.println(str.charAt(i) + " -> " + count);

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