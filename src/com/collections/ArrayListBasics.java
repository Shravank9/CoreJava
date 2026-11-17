package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics {

	public static void main(String[] args) {

		List<String> li = new ArrayList<>();

		li.add("Rahul");

		li.add("Vamshi");

		li.add("Kiran");

		li.add("Rohit");

		System.out.println(li);
		System.out.println("Total Stuents -> " + li.size());

		System.out.println(li.get(1));
		
		li.set(0, "Krishna");
		
		System.out.println(li);

		System.out.println("Is Vamshi present? "+li.contains("Vamshi"));
	}

}
