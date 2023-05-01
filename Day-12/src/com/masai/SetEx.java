package com.masai;
import java.util.*;
public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<Integer> set = new HashSet<>();
//		
//		set .add(10);
//		set .add(20);
//		set .add(30);
//		set .add(10);
//		set .add(20);
//		set .add(60);
//		set.add(null);
//		set .add(null);
//		
//		System.out.println(set);
		
		
		//the above code will not preserve entry points
		
		Set<Integer> set = new LinkedHashSet<>();
		
		set .add(10);
		set .add(20);
		set .add(30);
		set .add(10);
		set .add(20);
		set .add(60);
		set.add(null);
		set .add(null);
		
		System.out.println(set);
		
		//the above code will preserve entry points
		
	}

}
