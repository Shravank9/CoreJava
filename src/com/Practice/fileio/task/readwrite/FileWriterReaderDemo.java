package com.Practice.fileio.task.readwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderDemo {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\student.txt");

		try (FileWriter fw = new FileWriter(f)) {

			fw.write("Student Details");
			fw.write("\n");

			fw.write("Name: Rahul Kumar");
			fw.write("\n");

			fw.write("Age: 22");
			fw.write("\n");

			fw.write("Course: B.Tech");
			fw.write("\n");

			fw.write("Branch: CSE");
			fw.write("\n");

			fw.write("City: Hyderabad");
			fw.write("\n");
			System.out.println("Content written successfully");

		} catch (IOException e) {
			System.out.println("Writing failed");

			e.printStackTrace();
		}

		try (FileReader fr = new FileReader(f)) {
			int s = fr.read();
			while (s != -1) {
				System.out.print((char) s + "");
				s = fr.read();

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("-----------------------------------------------------------------------------------------------");

		System.out.println("Successfully Created File ,Written into File and Read from File using FileReader and FileWriter");

	}

}
