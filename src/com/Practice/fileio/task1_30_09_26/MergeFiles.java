package com.Practice.fileio.task1_30_09_26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFiles {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\C.txt");
		f.createNewFile();

		FileReader fr = new FileReader(new File("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\A.txt"));

		try (BufferedReader br = new BufferedReader(fr);
				PrintWriter pw = new PrintWriter("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\C.txt")) {
			String s = br.readLine();

			while (s != null) {
				pw.println(s);
				s = br.readLine();

			}
		}

		FileReader fr1 = new FileReader(new File("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\B.txt"));

		try (BufferedReader br = new BufferedReader(fr1);
				PrintWriter pw = new PrintWriter(
						new FileWriter("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\C.txt", true))) {
			String s = br.readLine();

			while (s != null) {
				pw.println(s);
				s = br.readLine();

			}

		}

	}

}
