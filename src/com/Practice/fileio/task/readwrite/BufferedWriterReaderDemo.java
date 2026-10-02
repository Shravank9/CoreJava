package com.Practice.fileio.task.readwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReaderDemo {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\employee.txt");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
			bw.write("Employee Details");
			bw.newLine();

			bw.write("Name: Vamshi");
			bw.newLine();

			bw.write("ID: 101");
			bw.newLine();

			bw.write("Department: IT");
			bw.newLine();

			bw.write("Role: Software Developer");
			bw.newLine();

			bw.write("Location: Hyderabad");
			bw.newLine();

			System.out.println("content has Written Sucessfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String s = br.readLine();

			while (s != null) {
				System.out.println(s + "");
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
				"Successfully Created File ,Written into File and Read from File Using BufferedReadder and BufferedWriter");
	}

}
