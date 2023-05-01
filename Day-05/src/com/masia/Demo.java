package com.masia;
//import java.util.*;
public class Demo {
	
	static {
		System.out.println("Static");
	}
	{
		System.out.println("non-static");
	}
	Demo(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		System.out.println("Main");
		Demo d = new Demo();  //if i remove this non static and demo will not be printed.
	}
}
