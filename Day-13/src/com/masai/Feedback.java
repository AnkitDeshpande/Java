package com.masai;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Feedback {
	
	static void change(LocalDate dt) {
		dt = LocalDate.of(2023, 01,01);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dt = LocalDate.of(2022, 01,01);
		change(dt);
		System.out.println(dt);
	}
}
