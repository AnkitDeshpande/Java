package com.masai;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class TreeMapUserDefinedObjEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, String> map = new TreeMap<>();
		
		map.put(new Student("Ankit", 5, 850), "Sambhajinagarl");
		map.put(new Student("Sanket", 3, 750), "Sambhajinagarl");
		map.put(new Student("Balu", 7, 650), "Sonai");
		map.put(new Student("Ankit", 5, 850), "Sambhajinagarl");
		
		System.out.println(map.size());
		System.out.println(map);
	}

}
