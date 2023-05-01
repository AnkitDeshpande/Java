package com.masai;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		
		try {
			System.out.println("inside try");
			System.out.println(100/0);
			
				try {
					A a1 = new A();
					a1.fun();
				} catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("Inside NumberFormatException");
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Inside catch of try1");
		}
		
		System.out.println("Main Ends");
	}
}
