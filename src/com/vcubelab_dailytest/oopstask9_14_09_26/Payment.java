package com.vcubelab_dailytest.oopstask9_14_09_26;

public abstract class Payment{

	double amount;
	double transactionFee;

	abstract void pay(double amount);

}
//Java-

//1.Create an abstract class Payment with fields amount and
//transactionFee.
//Create an abstract method pay(double amount).
//Create child classes CreditCard, UPI, and NetBanking that calculate 
//transaction fees (2%, 0%, and ₹10 respectively).
//Calculate and display the transaction fee and total amount to be paid.
//Print "Payment Successful" after completing the payment.