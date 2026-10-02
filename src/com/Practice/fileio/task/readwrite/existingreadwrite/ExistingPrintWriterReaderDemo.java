package com.Practice.fileio.task.readwrite.existingreadwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExistingPrintWriterReaderDemo {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\product.txt");

		try {

			if (!f.exists()) {
				f.createNewFile();
				System.out.println("File is Created Sucessfully!");
			}
			if (f.length() > 0) {
				System.out.println("File has Already Contrnt");
				System.out.println("Do You Want to add More Content(Yes/No):");

				try (Scanner sc = new Scanner(System.in)) {
					String choice = sc.nextLine();

					if (choice.equalsIgnoreCase("yes")) {

						System.out.println("Enter the Content to add: ");
						String content = sc.nextLine();

						try (PrintWriter pr = new PrintWriter(new FileWriter(f, true))) {
							pr.println(content);
						}

					} else {
						System.out.println("Skipped Operations on th File!");
					}
				}
			} else {
				System.out.println("File is Empty");
				System.out.println("Enter Content to Add: ");
				try (Scanner sc = new Scanner(System.in)) {
					String Content = sc.nextLine();

					try (PrintWriter pr = new PrintWriter(new FileWriter(f))) {
						pr.println(Content);
					}
				}
				System.out.println("Successfully Content is Added to File");

			}

		} catch (IOException e) {
			e.printStackTrace();

		}

		// read the content from the file:

		try (BufferedReader br = new BufferedReader(new FileReader(f))) {

			System.out.println("---------------------------------------");
			System.out.println("\nFinal File content is:");
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
				"---------------------------------------------------------------------------------------------------------");

		System.out.println(
				"Successfully Checked Existing File, Written Content Using PrintWriter and Read Content Using BufferedReader");

	}

}
