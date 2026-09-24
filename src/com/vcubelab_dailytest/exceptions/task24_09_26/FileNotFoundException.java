package com.vcubelab_dailytest.exceptions.task24_09_26;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException {

	private static FileReader ff;

	public static void main(String[] args) {

		File f = new File("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\aksh.txt");

		try {
			f.createNewFile();
			System.out.println("true");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			ff = new FileReader(f);

			int c = ff.read();
			while (c != -1) {
				System.out.print((char) c);
				c = ff.read();
				Thread.sleep(1000);

			}

		} catch (java.io.FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
//Today's Assignment 
//Java-
//
//1.Create a Java program to create and open student.txt using 
//FileInputStream. 
//If the file is not available, handle the Exception