package com.masai;

public class First {
	
	void fun1() {
		System.out.println("Inside fun1");
	}
	
	void fun1(int x) {
		System.out.println("Inside fun1(int x)");
	}
	void fun1(float f) {
		System.out.println("Inside fun1(float f)");
	}
	
	public static void main(String[] args) {
		First d1 = new First();
		d1.fun1(25.3f);
	}
}


//polymorpjism happens when same name of methods but different parameters