package com.masai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionClassesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = Arrays.asList("Pune", "Mumbai", "Nashik", "Bangalore");
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
	}

}
