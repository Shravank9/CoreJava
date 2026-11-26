package com.vcubelab_dailytest.Strings;

import java.util.Scanner;

public class ArrangeWordsByNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		String str = sc.nextLine();

		String[] words = str.split(" ");

		String[] result = new String[words.length];

		for (int i = 0; i < words.length; i++) {

			String word = words[i];

			char c = word.charAt(word.length() - 1);

			int position = Integer.parseInt(String.valueOf(c));

			result[position - 1] = word.substring(0, word.length() - 1);

		}

		for (String s : result) {

			System.out.print(s + " ");
		}
		sc.close();

	}

}
//Today's Assignment 
//
//Java 
//
//1.Remove All Duplicate Characters From a String
//    Input:  "programming"   Output: "progamin"
//
//2.Arrange Words Based on Numbers in the Sentence
//Example: Input: "going3 to2 Hyderabad5 i1 am2" → Output: "i am to going Hyderabad"