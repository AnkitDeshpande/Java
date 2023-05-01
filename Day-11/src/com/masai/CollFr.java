package com.masai;

import java.util.*;

public class CollFr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList<> ();
		
		l.add("Sambhajinagar");
		l.add("Ankit");
		l.add(10);
		l.add(new A());
		l.add(null);
		l.add(true);
		l.add(10.5);
		l.add(null);
		
		System.out.println(l);
		System.out.println(l.size());
		
		String s = (String) l.get(1);
		System.out.println(s);
		
		int i = (int) l.get(2);
		System.out.println(i);
	}

}
