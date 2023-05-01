package com.masai;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate l1 = LocalDate.now(); //yyyy-mm-dd
		System.out.println(l1);
		System.out.println(l1.isLeapYear());
		
		LocalDate l2 = l1.plusDays(1);
		System.out.println(l2);
		
		LocalTime l3 = LocalTime.now();
		System.out.println(l3);
	}

}
