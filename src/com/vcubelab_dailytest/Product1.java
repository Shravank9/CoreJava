package com.vcubelab_dailytest;

public class Product1 {
	
	int pid;
	String pname;
	int price;
	
	
	
	Product1(int pid,String pname,int price){
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Product1 t=new Product1(101,"sura",50000);
		Product1 t1=new Product1(102,"Karthik",25000);
		Product1 t2=new Product1(103,"shashi",30000);
;

		t.productinfo();
		t1.productinfo();
		t2.productinfo();
		
		
		System.out.println("Main Method ended");

	

	}
	void productinfo() {
		
	System.out.println("---------------------------------------------------------------------");
	System.out.println("Product of the Name     :"+pname);
	System.out.println("ID of the product       :"+pid);
	System.out.println("Price of the Product    :"+price);
	System.out.println("---------------------------------------------------------------------");
	}

}
