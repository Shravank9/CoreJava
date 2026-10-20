package com.vcubelab_dailytest.oopstask9_14_09_26;

public class NetBanking extends Payment{

	@Override
	void pay(double amount) {
		
		 transactionFee =10;

	        System.out.println("Amount: " + amount);
	        System.out.println("Transaction Fee: " + transactionFee);
	        System.out.println("Total Amount: " + (amount + transactionFee));
	        System.out.println("Payment Successful With NetBanking");
	}
	

}
