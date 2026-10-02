package com.Practice.fileio.task.readwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterReaderDemo {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\product.txt");

		try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {

			pw.println("Product Details");
			pw.println("Product: Laptop");
			pw.println("Brand: Dell");
			pw.println("Price: 65000");
			pw.println("Quantity: 5");
			pw.println("Rating: 4.5");
			pw.println("Available: true");
			pw.println("Category: Electronics");
			pw.println("Stock: Available");

			System.out.println("Content has Written Sucessfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String s = br.readLine();

			while (s != null) {
				System.out.println(s);
				s = br.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		System.out.println(
				"Successfully Created File ,Written into File and Read from File Using PrintWriter and BufferedReader");

	}

}
