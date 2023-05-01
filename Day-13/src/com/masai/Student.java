package com.masai;

public class Student implements Comparable<Student>{
	private String name; 
	private int roll;
	private int marks;
	
	public Student() {
	}
		
	public Student(String name, int roll, int marks){
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
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}
	
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		Student s1 = this;
//		Student s2 = o;
//		
////		if(s1.getMarks()>s2.getMarks()) {
////			return 1;
////		}else if(s1.getMarks()<s2.getMarks()) {
////			return -1;
////		}
////		return 0;
//		
//		
//		return s1.getName().compareTo(s2.getName());
//	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
