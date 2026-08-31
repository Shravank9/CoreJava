package com.vcubelab_dailytest.oopstask;

public class BankAccount {

	private String accountnumber;
	private String holderName;
	private double Balance;

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

//	public BankAccount(String accountnumber, String holderName, double Balance) {
//
//		this.accountnumber = accountnumber;
//		this.holderName = holderName;
//		this.Balance = Balance;
//	}

	void Withdrawal(double amount) {

		if (amount >= 500) {

			if (amount <= Balance) {
				Balance -= amount;
				System.out.println("Withdrwal is Successfull!" + amount);
			} else {
				System.out.println("Insufficient amount ");
			}
		} else {
			System.out.println("Withdrawl amount should be minimum  or above 500");
		}

	}

	void depoist(double amount) {

		if (amount >= 100) {
			Balance += amount;
			System.out.println("Depoist is Successfully");

		} else {

			System.out.println("Depoist amount should be atleast 100 or above");
		}
	}

}

//Today's Assignment
//Batch 75-
//Java-
//1.Create a BankAccount class using Encapsulation.
//Declare accountNumber, holderName, and balance as private.
//Initialize the balance with ₹5000 using a constructor or directly.
//Create a deposit(double amount) method to add money to the account.
//Create a withdraw(double amount) method that allows withdrawal only if the balance is sufficient.
//In main(), create an object, perform deposit and withdrawal operations, and display the final balance.
