/*1.Write a Java program to store the following product details using appropriate wrapper object types:
Product ID
Product Name
Product Price
Product Rating
Product Available Status
Stock Quantity
Discount Percentage
Product Code
Requirements:
1.Print all the product details in a clear and readable format.
2.Use wrapper object types for all applicable variables.
3.Assign suitable values to each variable.
4.Display the details using System.out.println().*/

package com.vcubelab_dailytest;

public class wrapperexmaple {
	Integer pid;
	Double pp;
	String pname;
	Double prating;
	Boolean Product_Available_Status;
	Integer ps;
	Double pd;
	Long pc;
	
	public static void main(String[] args) {
		
		wrapperexmaple t=new wrapperexmaple();
		t.pid=101;
		t.pp=10554.3;
		t.pname="Moto edge x71";
		t.prating=3.56;
		t.Product_Available_Status=true;
		t.ps=201;
		t.pd=0.2;
		t.pc=40120101233L;
		
		System.out.println("Product ID                :"+t.pid);
		System.out.println("Product Name              :"+t.pname);
		System.out.println("Product Price             :"+t.pp);
		System.out.println("Product Rating            :"+t.prating);
		System.out.println("Product Available Status  :"+t.Product_Available_Status);
		System.out.println("Stock Quantity            :"+t.ps);
		System.out.println("Discount Percentage       :"+t.pd);
		System.out.println("Product Code              :"+t.pc);
		System.out.println("-----------------------------------");
		

	}

}
