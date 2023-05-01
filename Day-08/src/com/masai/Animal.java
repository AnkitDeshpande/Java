package com.masai;

public abstract class Animal {
	String name;
	int age;
	String gender;
	
	public Animal(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	
	public abstract void eat();
	
}
