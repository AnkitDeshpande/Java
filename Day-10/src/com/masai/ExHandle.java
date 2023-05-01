package com.masai;

public class ExHandle {
	public static void main(String[] args) {
		System.out.println("Start of main");
		try {
			int i = 10;
			int j = 0;
			int z = i/j;
			
			System.out.println(z);
			System.out.println("End of try block");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Inside AE");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Ankit");
	}
}
