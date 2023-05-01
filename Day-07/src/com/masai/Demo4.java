package com.masai;

public class Demo4{
	
	final int x = 10;
	
	
	public static void main(String[] args) {
		
		Demo4 d = new Demo4();
		
		System.out.println(d.x);
		
		//d.x=20; // cannot change final variable
	}
}
