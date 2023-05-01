package com.masai;

public class Demo5 extends B{
	int z = 90;
	
	void funZ() {
		System.out.println("Inside funZ");
	}
	
	@Override
	protected void funY() {
		System.out.println("Inside funY of class Demo5");
	}
	
	public static void main(String[] args) {
		Demo5 d = new Demo5();
		
		d.funY();
		d.funZ();
	}
}
