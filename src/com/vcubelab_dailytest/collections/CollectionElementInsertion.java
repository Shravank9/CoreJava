package com.vcubelab_dailytest.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionElementInsertion {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Pineapple");
		fruits.add("Watermelon");
		fruits.add("Papaya");
		fruits.add("Guava");
		fruits.add("Pomegranate");

//		System.out.println(fruits);

		Collection<String> vegetables = new ArrayList<>();

		vegetables.add("Carrot");
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Onion");
		vegetables.add("Spinach");
		vegetables.add("Cabbage");
		vegetables.add("Cauliflower");
		vegetables.add("Brinjal");
		vegetables.add("Beans");
		vegetables.add("Radish");

//		System.out.println(vegetables);

		Collection<String> market = new ArrayList<>();

		market.addAll(fruits);
		market.addAll(vegetables);

//		System.out.println(market);

		fruits.clear();
//		System.out.println(fruits);
//		System.out.println(vegetables);

//		market.remove("Radish");
//		System.out.println(market);
		market.removeAll(vegetables);
//		System.out.println(fruits);
//		System.out.println(vegetables);
		System.out.println(market);

		boolean s = market.contains("Apple");
		System.out.println(s);

		boolean ss = market.containsAll(vegetables);
		System.out.println(ss);

	}

}
