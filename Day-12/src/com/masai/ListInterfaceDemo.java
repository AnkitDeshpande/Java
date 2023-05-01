package com.masai;

import java.util.*;

public class ListInterfaceDemo {
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		
		for(Integer i : l) {
			System.out.println(i);
		}
	}
}
