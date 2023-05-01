package com.masai;

public class constr {

	void fun() {
		System.out.println("Fun()");
	}
	
	constr(){
		System.out.println("Inside the constructor constr()");
	}
	public static void main(String[] args) {
		
		constr c1 = new constr();
		System.out.println(c1);
		c1.fun();
	}

}
