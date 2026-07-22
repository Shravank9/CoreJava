/*Today Task
1.Product Details
Create a class Product with:
productId
productName
price
2.Use a parameterized constructor to initialize the fields.
3.Create at least 3 Product objects and display their details.
*/

package com.vcubelab_dailytest;

public class Product {
	int pid;
	String pname;
	int price;
	
	
	 Product(){
		System.out.println("No Argument Constructor is Called");
		pid=101;
		pname="Sura";
		price=50000;
		
	}
	
	Product(int pid,String pname,int price){
		System.out.println("Parameterized 1Constructor Method Called the 1");
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
	Product(int pid ,String pname){
		System.out.println("Parameterized Constructor Method Called the 2 ");
		this.pid=pid;
		this.pname=pname;
		

		
	}
	Product(int id){
		System.out.println("Parameterized Constructor Method Called the 3 ");
		pid=id;
	}
	

	public static void main(String[] args) {
		Product t= new Product();
		t.productinfo();
		Product t1=new Product(102,"Karthik",50000);
		t1.productinfo();
		
		Product t2=new Product(102,"Shashi");
		t2.productinfo();
		Product t3=new Product(103);
		t3.productinfo();
		
		

	}
	
	void productinfo() {
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Product of the Name     :"+pname);
		System.out.println("ID of the product       :"+pid);
		System.out.println("Price of the Product    :"+price);
		System.out.println("---------------------------------------------------------------------");

	}

}
