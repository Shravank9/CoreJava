package com.Practice.fileio.task1_30_09_26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {

	public static void main(String[] args) throws IOException {

		System.out.println("Content from the A File:");

		FileReader fr = new FileReader("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\A.txt");

		try (BufferedReader br = new BufferedReader(fr)) {
			String s = br.readLine();
			while (s != null) {
				System.out.println(s);
				s = br.readLine();

			}
		}

		System.out.println("---------------------------------------------");
		System.out.println("Content from the B File:");
		FileReader fr1 = new FileReader("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\B.txt");

		try (BufferedReader br = new BufferedReader(fr1)) {
			String s = br.readLine();
			while (s != null) {
				System.out.println(s);
				s = br.readLine();

			}
		}

	}

}
