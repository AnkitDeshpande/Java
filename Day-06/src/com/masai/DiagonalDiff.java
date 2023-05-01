package com.masai;
import java.util.*;

public class DiagonalDiff {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter the Size of the matrix : ");
		int n = sc.nextInt();
		int mat[][] = new int[n][n];
		System.out.println("Enter elements of matrix : ");
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		for(int row[] : mat) {
			for(int col : row) {
				System.out.print(col +" ");
			}
			System.out.println();
		}
		
		
		int left = 0;
		int right = 0;
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					left += mat[i][j];
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i+j==n-1) {
					right += mat[i][j];
				}
			}
		}
		
		System.out.println("The addition of elements of first diagonal is : "+left);
		System.out.println("The addition of elements of second diagonal is : "+right);
		
		System.out.println("The difference of" +left+" "+ right + " "+"is "+ (left-right));
	}
}
