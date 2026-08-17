package com.vcubelab_dailytest;

import java.util.Random;
import java.util.Scanner;

public class Guess_Number {

	public static void main(String[] args) {
		Random r = new Random();
		int a = r.nextInt(10)+1;

		guess_Number(a);
	}

	private static void guess_Number(int a) {
		Scanner sc = new Scanner(System.in);

		int chances = 3;
		while (chances > 0) {
			System.out.println("Guess the Number between  0 to 9:");
			int b = sc.nextInt();
			chances--;

			if (a == b) {
				System.out.println("You won ,the random is equal to guess number");
				break;
			} else if (chances > 0) {
				System.out.println("You lost ,the Random Number is  not equal to guess number");
				System.out.printf("Try again,You have still %d chances", chances);

			} else {
				System.out.println("You lost ,the Random Number  is  not equal to guess number");
				System.out.println("The Generated  Random Number is ->" + a);

				System.out.println("The game is Ended");
			}

		}
		sc.close();

	}

}

//
//1.Write a Java program that generates a random number between 1 and 10. 
//The user gets 3 chances to guess the number.
//
//If the user guesses correctly, display "You Won!" and stop the game.
//If all 3 attempts are wrong, display "You Lost!" and show the random number.