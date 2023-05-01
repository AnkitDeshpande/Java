package com.masai;
import java.util.*;
public class MapEx {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		
		System.out.println(m);
		
		m.put(10,"Delhi");
		m.put(20,"Mumbai");
		m.put(30,"Bangalore");
		m.put(40,"Sambhajinagar");
		m.put(15,"Nashik");
		m.put(7,"Pune");
		m.put(1,"Kolhapur");
		m.put(3,null);
		m.put(null,null);
		
		System.out.println(m);
	}
}
