package com.masai;
import java.util.*;
public class UserDefinedObjEx {
	public static void main(String[] args) {
		Map<Student, String> map = new HashMap<>();
		
		map.put(new Student("Ankit", 5, 850), "Sambhajinagarl");
		map.put(new Student("Sanket", 3, 750), "Sambhajinagarl");
		map.put(new Student("Balu", 7, 650), "Sonai");
		map.put(new Student("Ankit", 5, 850), "Sambhajinagarl");
		
		System.out.println(map.size());
		System.out.println(map);
		
		// to remove duplicate override the hashcode and equals method
	}
}
