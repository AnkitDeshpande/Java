package com.masia;

public class StudentEncap {
	private String name; 
	private int roll;
	private int marks;
	
	public StudentEncap() {}
		
	public StudentEncap(String name, int roll, int marks){
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	
	void details(){
		System.out.println("Roll no : "+ roll);
		System.out.println("Name : "+ name);
		System.out.println("Marks : "+ marks);
	}
}
