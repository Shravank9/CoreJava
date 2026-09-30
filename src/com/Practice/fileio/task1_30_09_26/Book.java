package com.Practice.fileio.task1_30_09_26;

import java.io.Serializable;

public class Book implements Serializable{

	transient int bookId;
	String title;
	String author;
	double price;
	
	
	public Book(int bookId, String title, String author, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	

}
/// Today's Assignment
//
//Java-
//
//1.Create a custom exception DuplicateUsernameException. Throw the exception 
//if the entered username already exists; otherwise, create the account.
//2.Create a Book class with bookId, title, author, and price, where bookId is declared as transient. 
//Serialize the Book object into a file, deserialize it, and display all the details