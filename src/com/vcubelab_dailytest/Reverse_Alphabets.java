package com.vcubelab_dailytest;

import java.util.Scanner;

public class Reverse_Alphabets {

	public static void main(String[] args) {
		
		for (int i=26;i>=1;i--) {
			
			System.out.print((char)(i + 64) + " ");
		
		}
		System.out.println();
		
		for (int i = 90; i >= 65; i--) {
            System.out.print((char)i + " ");
		
		
		}
		

	}

}


//2.Print Alphabets in Reverse Order
//Question:
//Write a Java program to print uppercase alphabets from Z to A using a for loop.
//Output
//Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
