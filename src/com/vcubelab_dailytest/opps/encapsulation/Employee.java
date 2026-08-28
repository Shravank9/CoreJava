package com.vcubelab_dailytest.opps.encapsulation;

public class Employee {

	private int id;
	private String name;
	private double sal;
	private String password;

	@Override
	public String toString() {
		return super.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
//Today's Assignment
//
//Java-
//
//1.Create an encapsulated class Employee with private fields: id, name, salary, password.
//Requirements:
//1. Make all fields private (Data Hiding).
//2. Create public setters and getters.
//3. Access and modify the data
