package com.masai;

public class Demo1 extends Demo{
	
	@Override
	public void funAbs() {
		// TODO Auto-generated method stub
		System.out.println("Inside funAbs");
	}
	
	@Override
	public void funAbs1() {
		// TODO Auto-generated method stub
		System.out.println("Inside funAbs1");
	}
	
	@Override
	public void funAbs2() {
		// TODO Auto-generated method stub
		System.out.println("Inside funAbs2");
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo1();
		d.fun();
		d.funAbs();
		d.funAbs1();
		d.funAbs2();
	}


}
