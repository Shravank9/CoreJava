package com.corejavaintro;

public class prepare2 {
	
	  int a;
	  String b;
     
	  static int c;
	  static String d;
	  //instance area now menas non static area
 void main() {
	 int a=10;//local variable
	 prepare2 obj=new prepare2();
	 obj.a=1;
	 b="cmr";// obj.a and obj.b is assing the avlues of the instance variable
	 c=2;//line 16 nad intialzation the staic values diretlu we ca usee calss or objecr refrence also
	 d="cmrtc";
	 System.out.println(obj.a);
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(c);
	 System.out.println(d);
	 
	 

	}

}
