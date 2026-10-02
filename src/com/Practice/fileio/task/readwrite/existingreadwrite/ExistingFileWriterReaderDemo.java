package com.Practice.fileio.task.readwrite.existingreadwrite;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExistingFileWriterReaderDemo {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\student.txt");

		try {
			if (!f.exists()) {
				f.createNewFile();
				System.out.println("File created successfully!");
			}

			if (f.length() > 0) {

				System.out.println("File already contains content.");
				System.out.print("Do you want to add more content? (yes/no): ");

				try (Scanner sc = new Scanner(System.in)) {
					String choice = sc.nextLine();

					if (choice.equalsIgnoreCase("yes")) {

						System.out.print("Enter the content to add: ");
						String content = sc.nextLine();

						try (FileWriter fw = new FileWriter(f, true)) {

							fw.write("\n");
							fw.write(content);

							System.out.println("Content added successfully!");
						}

					} else {

						System.out.println("Writing skipped.");
					}
				}

			} else {

				System.out.println("File is empty.");

				try (Scanner sc = new Scanner(System.in)) {
					System.out.print("Enter content to write: ");
					String content = sc.nextLine();

					try (FileWriter fw = new FileWriter(f)) {

						fw.write(content);

						System.out.println("Content written successfully!");
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Read the final content
		try (FileReader fr = new FileReader(f)) {

			System.out.println("\nFinal File Content:");

			int s = fr.read();

			while (s != -1) {
				System.out.print((char) s);
				s = fr.read();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		System.out.println(
				"Successfully Checked Existing File, Written Content Using FileWriter and Read Content Using FileReader");

	}
}