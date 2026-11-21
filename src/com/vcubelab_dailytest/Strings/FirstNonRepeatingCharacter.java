package com.vcubelab_dailytest.Strings;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.next();

		int[] arr = new int[256];

		for (int i = 0; i < str.length(); i++) {

			arr[str.charAt(i)]++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] == 1) {
				System.out.println(str.charAt(i));
				break;

			}
		}

		sc.close();
	}

}
//2.Print First Non-Repeating Characters in a String
//Example: Input: "swiss" → Output: "w"