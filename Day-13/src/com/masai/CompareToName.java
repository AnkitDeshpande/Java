package com.masai;

import java.util.TreeSet;

public class CompareToName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts = new TreeSet<>();
		
		ts.add(new Student("Ankit", 1, 850));
		ts.add(new Student("Sanket", 2, 750));
		ts.add(new Student("Balu", 3, 650));
		ts.add(new Student("Ravi", 4, 550));
		ts.add(new Student("Mayur", 5, 450));
		
		
		for(Student k : ts) {
			System.out.println(k);
		}
	}

}
