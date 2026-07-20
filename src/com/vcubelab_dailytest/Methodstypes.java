/*Today Task
Java
1.Problem Statement:
Write a Java program to create a method that displays the details of a bank account.
Requirements:
1.Create a class named BankAccount.
2.Create a method displayAccount() with no arguments and no return type.
3.Inside the method, display Account Number, Account Holder Name, Account 4.Type, and Balance.
Call the method from the main() method.
*/

package com.vcubelab_dailytest;

public class Methodstypes {

	public static void main(String[] args) {
		Methodstypes t=new Methodstypes();
		t.displays();
		
		

	}

	void displays() {
		long accountnumber=10456646489L;
		String AccountName="Karthik";
		double Balance=257678.7679D;
		String Account_Type="SavingsAcoount";
		
		System.out.println("Account Number      :"+accountnumber);
		System.out.println("Account Holder Name :"+AccountName);
		System.out.println("Balance             :" +Balance);
		System.out.println("Account Type        :"+Account_Type);
		System.out.println("----------------------------------");


	}
}
