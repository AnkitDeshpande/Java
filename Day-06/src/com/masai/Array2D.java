package com.masai;

public class Array2D {
	public static void main(String[] args) {
//		int arr[][] = new int[3][3];
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[0][1]);
//		
//		for(int  i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++){
//				arr[i][j] = j+1;
//			}
//		}
//		
//		for(int[]  row : arr) {
//			for(int col : row){
//				System.out.print(col + " ");
//			}
//			System.out.println();
//		}
		
		int arr[][] = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = j+1;
			}
		}
		
		
		for(int row[] : arr) {
			for(int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
