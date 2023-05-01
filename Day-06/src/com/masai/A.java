package com.masai;

public class A {
	int i = 10;
	
	void funA() {
		System.out.println("Inside funA");
	}
	
	A(){
		System.out.println("Inside constructor A");
	}
	A(int i){
		System.out.println("Inside parameterized constructor A");
	}
}
