package com.masia;

public class Student {
	String name; 
	int roll;
	int marks;
	
	public Student(String name, int roll, int marks){
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	void details(){
		System.out.println("Roll no : "+ roll);
		System.out.println("Name : "+ name);
		System.out.println("Marks : "+ marks);
	}
}
