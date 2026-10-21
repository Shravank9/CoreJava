package com.vcubelab_dailytest.exceptions.task22_09_26;

import java.util.Scanner;

public class Paasenger_booking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of passengers:");
		int numberofPassegers = sc.nextInt();
		sc.nextLine();
		Object[][] obj = new Object[numberofPassegers][3];

		try {
			for (int i = 0; i < numberofPassegers; i++) {
				System.out.println("\nEnter details for Passenger " + (i + 1));

				System.out.println("Enter Passenger ID:");
				String id = sc.nextLine();
				int idd = Integer.parseInt(id);

				System.out.println("Enter Age:");
				String age = sc.nextLine();
				int b = Integer.parseInt(age);

				System.out.println("Enter Seat Number:");
				String seat = sc.nextLine();
				int c = Integer.parseInt(seat);

				obj[i][0] = idd;
				obj[i][1] = b;
				obj[i][2] = c;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("Enter the total lagguage:");
			int bagge = sc.nextInt();
			System.out.println("Avg baggae:" + (bagge / numberofPassegers));
			System.out.println("Enter the indexx to see passnedr details:");
			int index = sc.nextInt();
			System.out.println(obj[index]);

		} catch (Exception e) {
			e.printStackTrace();
		}

		sc.close();

	}

}
