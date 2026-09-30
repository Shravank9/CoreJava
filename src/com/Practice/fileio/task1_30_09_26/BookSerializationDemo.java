package com.Practice.fileio.task1_30_09_26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("Main method started");
		System.out.println("Serializable stared ");

		Book book = new Book(102, "Python Programming", "Guido van Rossum", 699.50);

		File f = new File("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\test.ser");

		FileOutputStream fos = new FileOutputStream(f);

		try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(book);
		}

		System.out.println("Serializable ended");
		System.out.println("De-Serializable Started");


		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\test.ser");
		
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			Book book1 = (Book) ois.readObject();
			
			System.out.println(book1.bookId);
			System.out.println(book1.author);
			System.out.println(book1.title);
			System.out.println(book1.price);
		}

		System.out.println("De-Serializable ended");

		System.out.println("Main method ended");

	}

}
