package com.vcubelab_dailytest.exceptions.task323_09_26;

public class MagazineBookCasting {

	public static void main(String[] args) {

		System.out.println("Main methiid ended");

		try {
			Object obj = new Magazine();

			Book b = (Book) obj;
			
			Object obj1=new Book();
			Magazine m=(Magazine) obj1;
			
		} catch (ClassCastException e) {

			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
		System.out.println("Main method ended");

	}

}

class Book {

	Book() {

	}

}

class Magazine extends Book {

	Magazine() {

	}

}
//Java-
//1.Create classes Book and Magazine. Store a Magazine object in an Object reference.
//Cast it to Book and handle the ClassCastException.