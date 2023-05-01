package com.masai;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<> ();
		
		l.add("Mumbai");
		l.add("Pune");
		l.add("Sambhajinagar");
		l.add("Kolhapur");
		l.add("Delhi");
		l.add(null);
		
		System.out.println(l);
		System.out.println(l.size());
		
		String s = l.get(1);
		System.out.println(s);
		
		l.add(4, "Nashik");
		System.out.println(l);
		System.out.println(l.get(0));  //Mumbai
		System.out.println(l.get(l.size()-1));  //Delhi
		
		for(String i : l) {
			System.out.print(i+" ");
		}
		
		//for integer list use l.Iterator();
	}
}
