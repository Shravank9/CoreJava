package com.vcubelab_dailytest;

import java.util.Scanner;

public class Check_vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char c = sc.next().charAt(0);
		
		String result = (c == 'A') ? "Vowel" :
            (c == 'a') ? "Vowel" :
            (c == 'E') ? "Vowel" :
            (c == 'e') ? "Vowel" :
            (c == 'I') ? "Vowel" :
            (c == 'i') ? "Vowel" :
            (c == 'O') ? "Vowel" :
            (c == 'o') ? "Vowel" :
            (c == 'U') ? "Vowel" :
            (c == 'u') ? "Vowel" :
            "Consonant";
		System.out.println("Result:"+result);
		sc.close();

	}

}


//
//Java 
//Java Assignment
//1.Write a Java program to check whether a given character is a vowel or a consonant using the ternary operator.
//
//Sample Input 1:
//Enter a character: A
//Sample Output 1:
//Vowel