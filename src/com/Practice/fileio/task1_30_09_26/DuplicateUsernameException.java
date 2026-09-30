package com.Practice.fileio.task1_30_09_26;

public class DuplicateUsernameException extends Exception {

	public DuplicateUsernameException(String s) {
		super(s);
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