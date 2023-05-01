package com.masai;
import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		
		
		st.add(10);
		st.push(20);
		st.push(30);
		
		
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		
		System.out.println(st);
	}

}
