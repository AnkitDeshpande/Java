package com.masai;

public class HasARelationship {
	int x= 100;
	
	A a1 = new A();
	
	public static void main(String[] args) {
		HasARelationship h1 = new HasARelationship(); 
		
		System.out.println(h1.x);
		System.out.println(h1.a1);
		h1.a1.fun();
	}
}
