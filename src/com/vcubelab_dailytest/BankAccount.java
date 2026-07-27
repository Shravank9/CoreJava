//Java
//Bank Account Management using Constructor Chaining
//Create a class BankAccount with the following overloaded constructors:
//BankAccount()
//BankAccount( accountHolder)
//BankAccount( accountHolder,  accountNumber)
//BankAccount( accountHolder,  accountNumber,  balance)
//Requirements
//1.Use constructor chaining with this().
//2.The final constructor should initialize all instance variables.
//3.Create a display() method to print all account details.
//In the main() method:
//4.Create one object using the default constructor.
//5.Create another object using the constructor with only the account holder's name.
//6.Create another object using the constructor with name and account number.
//7.Create the final object using all three values.
//Display the details of all objects.
//
//Sample Output
//Account Holder : Unknown
//Account Number : 0
//Balance        : 0.0
//
//Account Holder : Krishna
//Account Number : 0
//Balance        : 0.0
//
//Account Holder : Krishna
//Account Number : 1234567890
//Balance        : 0.0
//
//Account Holder : Krishna
//Account Number : 1234567890
//Balance        : 50000.0


package com.vcubelab_dailytest;

public class BankAccount {
	String accountholder;
	long accountnumber;
	double balance;
	
	public BankAccount() {
		this("Unknown");
	}
	BankAccount(String accountholder){
		this( accountholder,0);
	}
	BankAccount(String accountholder,long accountnumber){
		this(accountholder,accountnumber,0.0);
		
	}
	BankAccount(String accountholder,long accountnumber,double balance){
		this.accountholder=accountholder;
		this.accountnumber=accountnumber;
		this.balance=balance;
		
	}
	
	void display() {
		System.out.println("Account Holder                                :"+accountholder);
		System.out.println("Account Number                                :"+accountnumber);
		System.out.println("Balance                                       :"+balance);
		System.out.println("______________________________________________________________________");
	}

	public static void main(String[] args) {
		BankAccount t= new BankAccount();
		t.display();
		BankAccount t1= new BankAccount("Krishna");
		t1.display();
		BankAccount t2= new BankAccount("Krishna",76757657757L);
		t2.display();
		BankAccount t3= new BankAccount("Krishna",76757657757L,50000);
		t3.display();
		
		
		
		

	}

}
