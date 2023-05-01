package com.masai;
import java.util.*;
public class HashtableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new Hashtable<>();
		
		map.put(100, "Sumit");
		map.put(300, "Sumit");
//		map.put(100, null);   //null not allowed
		map.put(1100, "Ankit");
		System.out.println(map);
		
		for(Map.Entry<Integer, String> me : map.entrySet()) {
			System.out.println(me.getKey() + " -->" + me.getValue());
		}
	}

}
