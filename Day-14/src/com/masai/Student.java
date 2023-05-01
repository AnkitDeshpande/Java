package com.masai;

import java.util.Objects;

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
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		Student s1 = this;
		Student s2 = o;
		
		if(s1.getMarks()>s2.getMarks()) {
			return 1;
		}else if(s1.getMarks()<s2.getMarks()) {
			return -1;
		}
		return 0;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(marks, name, roll);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
//	}

	void details(){
		System.out.println("Roll no : "+ roll);
		System.out.println("Name : "+ name);
		System.out.println("Marks : "+ marks);
	}

}
