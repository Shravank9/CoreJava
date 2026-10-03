package com.vcubelab_dailytest.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserializationDemo {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream(
				"C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\StudentData.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			Students s = (Students) ois.readObject();

			System.out.println("After Deserialization:");

			System.out.println("ID: " + s.getSid());
			System.out.println("Name: " + s.getName());
			System.out.println("Email: " + s.getEmail());
			System.out.println("Password: " + s.getPassword());

			System.out.println("\nObject Deserialized Successfully!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
