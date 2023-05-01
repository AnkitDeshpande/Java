package com.you;

import java.io.Serializable;

class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	int roll;
	String name;
	int marks;
	transient String password;
	Address address;

	Student(int roll, String name, int marks, String password, Address address) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.password = password;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Roll: " + roll + ", Name: " + name + ", Marks: " + marks + ", Address: " + address.city
				+ ", " + address.state + ", " + address.pincode;
	}
}