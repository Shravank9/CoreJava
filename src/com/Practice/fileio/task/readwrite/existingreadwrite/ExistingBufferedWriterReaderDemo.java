package com.Practice.fileio.task.readwrite.existingreadwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExistingBufferedWriterReaderDemo {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\employee.txt");

		try {

			if (!f.exists()) {
				f.createNewFile();
				System.out.println("File is Created Sucessfully!");
			}
			if (f.length() > 0) {
				System.out.println("File has Already content!");
				System.out.println("Do you want to add more Content to File(Yes/No): ");
				try (Scanner sc = new Scanner(System.in)) {
					String choice = sc.nextLine();

					if (choice.equalsIgnoreCase("yes")) {

						System.out.println("Enter the content to add it:");
						String content = sc.nextLine();

						try (BufferedWriter bw = new BufferedWriter(new FileWriter(f,true))) {
							bw.newLine();
							bw.write(content);
							System.out.println("Content added successfully!");

						}

					} else {
						System.out.println("Skipped Operations!");
					}
				}
			} else {
				System.out.println("File is Empty!");
				try (Scanner sc = new Scanner(System.in)) {
					System.out.println("Enter the content to Write :");
					String content = sc.nextLine();

					try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
						bw.write(content);
						System.out.println("Content added successfully!");

					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// read the content from the file:

		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			
			System.out.println("\nFinal File Content:");

			
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
				"Successfully Checked Existing File, Written Content Using BufferedWriter and Read Content Using BufferedReader");

		
	}

}
