package com.masai;

public class Adrress {
	private String name;
	private String email;
	private String city;
	private String state;
	private int pincode;
	private int mobile;
	
	public Adrress(){
		
	}

	public Adrress(String name, String email, String city, String state, int pincode, int mobile) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
}
