package com.masia;

public class Demo3 {
	public static void main(String[] args) {
		String s1 = new String("Ankit");
		String s2 = "Ankit";
		String s3 = "Ankit";
		String s4 = s1;
		String s5 = " Deshpande";
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s2); // false
		System.out.println(s1 == s4); // true
		System.out.println(s1.substring(1)); //nkit
		System.out.println(s1.substring(2)); //kit
		System.out.println(s1.substring(0, 4)); //Anki
		System.out.println(s1.concat(s5)); //nkit
	}
}
