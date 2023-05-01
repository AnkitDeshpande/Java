package com.masia;

public class Demo5 {
	
	public static String reverse(String str){
		String res = "";
		
		char arr[] = str.toCharArray();
		
		for(int i = arr.length-1; i>=0; i--) {
			res += arr[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverse("Ankit"));
		
		
	}
}
