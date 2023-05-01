package com.you;

import java.io.Serializable;

class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	String state;
	String city;
	int pincode;

	Address(String state, String city, int pincode) {
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
}


