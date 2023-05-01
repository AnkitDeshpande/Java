package com.masai;

public class Demo4 extends A{
	
	int x= 100;
	
	void funX() {
		System.out.println("Inside funX");
	}

	Demo4(){
		super(10);
		System.out.println("Inside constructor Demo4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 d = new Demo4();
		
		d.funA();
		System.out.println(d.i);
		
		d.funX();
		System.out.println(d.x);
	}

}
