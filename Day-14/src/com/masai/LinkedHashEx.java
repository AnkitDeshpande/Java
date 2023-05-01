package com.masai;
import java.util.*;
public class LinkedHashEx {
	public static void main(String[] args) {
		Map<Integer, String> m = new LinkedHashMap<>();
		
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
		
		System.out.println("Getting all the keys....");
		
		Set<Integer> keys = m.keySet();
		
		for(Integer key : keys) {
			System.out.println(key+" ");
		}
		
		System.out.println("==================================================================");
		
		System.out.println("Getting all the values.....");
		
		Collection<String> val = m.values();
		for(String v : val) {
			System.out.println(v+" ");
		}
		
		
		System.out.println("==================================================================");
		
		
		System.out.println("Getting key and value at same time : ");
		
		Set<Map.Entry<Integer, String>> keyValue = m.entrySet();
		
		for(Map.Entry<Integer, String> me : keyValue) {
			System.out.println(me.getKey()+" --> "+me.getValue());
		}
		
		System.out.println("==================================================================");
		
		System.out.println("Another way : ");
		
		for(Integer i : keys) {
			System.out.println(i+"--->"+ m.get(i));
		}
	}
}
