package com.masia;

public class Demo6 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 100;
		arr[1] = 10;
		arr[2] = 20;
		arr[3] = 30;
		System.out.println(arr);
		System.out.println(arr.length);
		
		for(int n : arr) { //for(data_type variable name : array_name){};
			System.out.println(n+" ");
		} // this is enhancd for loop, only applicable for array;
	}
}