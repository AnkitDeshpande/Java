package com.masai;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ObjectSort {
	public static void main(String[] args) {
		List<Student> ls = Arrays.asList(
				new Student("Ankit",5,850), new Student("Sanket", 6, 650)
				);
//		Collection.sort(ls);
		System.out.println(ls);
	}
}
