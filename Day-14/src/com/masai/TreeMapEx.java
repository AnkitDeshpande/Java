package com.masai;
import java.util.*;
public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new TreeMap<>();
		
		map.put("Maharashtra", "Mumbai");
		map.put("Up", "Lucknowi");
		map.put("Delhi", "Delhi");
		map.put("Bihar", "Patna");
		
		System.out.println(map); //keys will be sorted, because its not comparable and u will get Null pointer exception
	}

}
