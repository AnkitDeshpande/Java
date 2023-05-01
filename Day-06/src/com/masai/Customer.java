package com.masai;

public class Customer extends Adrress{

	private int custId;
	
	public Customer(){
		
	}

	public Customer(String name, String email, String city, String state, int pincode, int mobile, int custId) {
		super(name, email, city, state, pincode, mobile);
		this.custId = custId;
	}
	
}
