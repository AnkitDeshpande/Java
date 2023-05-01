package com.masia;

import java.util.*;

public class Demo2 {
	
	public static void main(String[] args) {
		
		StudentEncap s1 = new StudentEncap();
		s1.setRoll(1);
		s1.setName("Ankit");
		s1.setMarks(800);
		
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
		System.out.println(s1.getMarks());
		System.out.println("==================");
		
		StudentEncap s2 = new StudentEncap("Sanket", 2,  800);
		System.out.println(s2.getRoll());
		System.out.println(s2.getName());
		System.out.println(s2.getMarks());
		System.out.println("==================");
	}
}
