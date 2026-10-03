package com.vcubelab_dailytest.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerializationDemo {

	public static void main(String[] args) {

		System.out.println("Before Serialization:");
		Students s1 = new Students(101, "Rahul", "rahul@gmail.com", "Rahul@123");

		System.out.println("ID: " + s1.getSid());
		System.out.println("Name: " + s1.getName());
		System.out.println("Email: " + s1.getEmail());
		System.out.println("Password: " + s1.getPassword());

		try (FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\StudentData.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(s1);

			System.out.println("\nObject Serialized Successfully!");
			System.out.println("\nAfter Serialization:");
			System.out.println("ID: " + s1.getSid());
			System.out.println("Name: " + s1.getName());
			System.out.println("Email: " + s1.getEmail());
			System.out.println("Password: " + s1.getPassword());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

//		System.out.println("Before Serialization:");
//
//		Students s = new Students();
//
//		s.setSid(102);
//		s.setName("Rahul");
//		s.setEmail("rahl@gmail.com");
//		s.setPassword("Raul@123");
//
//		System.out.println("ID: " + s.getSid());
//		System.out.println("Name: " + s.getName());
//		System.out.println("Email: " + s.getEmail());
//		System.out.println("Password: " + s.getPassword());
//
//		try (FileOutputStream fos = new FileOutputStream(
//				"C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\StudentData.txt");
//				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//
//			oos.writeObject(s1);
//
//			System.out.println("\nObject Serialized Successfully!");
//			System.out.println("\nAfter Serialization:");
//			System.out.println("ID: " + s.getSid());
//			System.out.println("Name: " + s.getName());
//			System.out.println("Email: " + s.getEmail());
//			System.out.println("Password: " + s.getPassword());
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		System.out.println("Successfully Created File and Serialized Student Object Using ObjectOutputStream");

	}

}
