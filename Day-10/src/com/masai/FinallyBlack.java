package com.masai;

public class FinallyBlack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start of main");
		
		try {
			//System.exit(1); // finally will not execute if use this.
			int ans = 25/0;
			System.out.println(ans);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			System.out.println("Finally block always execute.");
			//most time database closing statements are written here.
		}
		
		
		System.out.println("End of main");

	}

}
