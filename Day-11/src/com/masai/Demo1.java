package com.masai;

public class Demo1 extends A{
	
	public Demo1() throws Exception{
		System.out.println("Inside constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Starts");
		
		try {
			Demo1 d = new Demo1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Ends");

	}

}
