package com.Practice.fileio.task1_30_09_26;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFiles {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\A.txt");

		f.createNewFile();

		try (PrintWriter pf = new PrintWriter(f)) {
			pf.println("Student Name: Rahul");
			pf.println("Course: Computer Science");
			pf.println("College: CMR Technical Campus");
			pf.println("Year: Final Year");
			pf.println("Skill: Java Programming");
		}

		File ff = new File("C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\B.txt");
		ff.createNewFile();
		try (PrintWriter pf = new PrintWriter(ff)) {
			pf.println("Subject: Java Programming");
			pf.println("Assessment: File Handling");
			pf.println("Score: 85");
			pf.println("Status: Passed");
			pf.println("Performance: Good understanding of File I/O");

		}

	}

}
