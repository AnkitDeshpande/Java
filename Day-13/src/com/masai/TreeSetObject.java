package com.masai;
import java.util.*;
public class TreeSetObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts = new TreeSet<>(new CompareMarks());
		
		ts.add(new Student("Ankit", 1, 850));
		ts.add(new Student("Sanket", 2, 750));
		ts.add(new Student("Balu", 3, 650));
		ts.add(new Student("Ravi", 4, 550));
		ts.add(new Student("Mayur", 5, 450));
		
//		System.out.println(ts);
		
		for(Student k : ts) {
			System.out.println(k); //make changes in Student class of CompareTo method to get the sorted roll Number
		}
	}

}
