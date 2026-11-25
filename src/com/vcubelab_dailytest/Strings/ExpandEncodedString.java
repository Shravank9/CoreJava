package com.vcubelab_dailytest.Strings;

import java.util.Scanner;

public class ExpandEncodedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Encoded String: ");
		String str = sc.nextLine();
		StringBuilder s = new StringBuilder();

		char currentChar = 0;
		String number = "";

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (Character.isDigit(c)) {

				number = number + c;

			} else if (Character.isLetter(c)) {

				if (number.length() > 0) {

					int num = Integer.parseInt(number);

					s.repeat(currentChar, num);

					number = "";
				}
				currentChar = c;

			}

		}
		if (number.length() > 0) {

			int num = Integer.parseInt(number);

			s.repeat(currentChar, num);
		}

		System.out.println("Expanded String: " + s);

		sc.close();

	}

}
