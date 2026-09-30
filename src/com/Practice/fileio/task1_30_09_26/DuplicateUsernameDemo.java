package com.Practice.fileio.task1_30_09_26;

import java.util.Scanner;

public class DuplicateUsernameDemo {

	public static void main(String[] args) throws DuplicateUsernameException {

		try (Scanner sc = new Scanner(System.in)) {
			String[] usernames = { "rahul", "vamsi", "suresh", "anil" };

			System.out.println("Enter the Username:");
			String name = sc.next();

			boolean found = false;

			for (String username : usernames) {

				if (name.equals(username)) {
					found = true;

					throw new DuplicateUsernameException("This Username has Already Existed!");
				}
			}
			if (!found) {
				System.out.println("Account created successfully");
			}
		}

	}

}
//Today's Assignment
//
//Java-
//
//1.Create a custom exception DuplicateUsernameException. Throw the exception 
//if the entered username already exists; otherwise, create the account.
//2.Create a Book class with bookId, title, author, and price, where bookId is declared as transient. 
//Serialize the Book object into a file, deserialize it, and display all the details
