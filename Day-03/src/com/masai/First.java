package com.masai;

public class First {
	int k;
	int i = 15;         // Instance variable
	static int j = 20;	// static variable
	
	
	void fun() {
	System.out.println("Iside fun of class First");
	}
	
	static void fun1() {
		System.out.println("Inside fun1 of class First");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;  //local variable
				System.out.println(x); //10
				
				First f1 = new First();
				System.out.println(f1); // com.masai.First@memoryAddress
				
				System.out.println(f1.i); // 15
				System.out.println(f1.k); // jvm will give default value that is 0
				System.out.println(f1.k=100); // 100
				System.out.println(j); // 20
				
				f1.fun();   // Iside fun of class First
				fun1();
	}

}
