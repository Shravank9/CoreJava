package com.vcubelab_dailytest.Strings;

import java.util.Scanner;

public class FirstNonRepeating_Character {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String str=sc.next();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(str.indexOf(c)==str.lastIndexOf(c)) {
				
				System.out.println(c);
				break;
				
			}
		}
		sc.close();
	}

}
//2.Print First Non-Repeating Characters in a String
//Example: Input: "swiss" → Output: "w"