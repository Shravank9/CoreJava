package com.Practice.fileio.task1_30_09_26;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIOOperations {

	public static void main(String[] args) {

		String path = "C:\\Users\\shrav\\OneDrive\\Desktop\\java learning\\";

		// write the content into a "Trip Details.txr" file using the printwriter

		try (PrintWriter pw = new PrintWriter((path + "Trip Details.txt"));) {
			pw.println("Passenger Name: Ananya Sharma");
			pw.println("Destination: Goa");
			pw.println("Travel Date: 15 October 2026");
			pw.println("Number of Passengers: 2");
			pw.println("Travel Class: Economy");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// write the content into a "Hotel Details.txr" file using the printwriter

		try (PrintWriter pw = new PrintWriter((path + "Hotel Details.txt"));) {
			pw.println("Hotel Name: Ocean View Resort");
			pw.println("Room Type: Deluxe Room");
			pw.println("Check-in: 15 October 2026");
			pw.println("Check-out: 18 October 2026");
			pw.println("Booking Status: Confirmed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Read the content from "Trip Details.txt" file and write in "Booking Summary"

		try (BufferedReader br = new BufferedReader(new FileReader((path + "Trip Details.txt")));
				PrintWriter pr = new PrintWriter((path + "Booking Summary.txt"));) {

			String s = br.readLine();

			while (s != null) {
				pr.println(s);
				s = br.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// Read the content from "Hotel Details.txt file and write in "Booking Summary"

		try (BufferedReader br = new BufferedReader(new FileReader((path + "Hotel Details.txt")));
				PrintWriter pr = new PrintWriter(new FileWriter((path + "Booking Summary.txt"), true));) {
			String s = br.readLine();

			while (s != null) {
				pr.println(s);
				s = br.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("Content from Trip Details.txt & Hotel Details.txt Files are copied to Booking Summary");
	}

}
