package com.masai;
import java.util.*;
public class CollectionMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 12, 9, 20, 15};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		List<String> ls = Arrays.asList("Pune", "Mumbai", "Nashik");
		System.out.println(ls);
		
		int index = Arrays.binarySearch(arr,15); // array should be sorted to search using binary search.
		System.out.println(index);
		
		
		int arr1[] = {10, 12, 9, 20, 15};
		//Arrays.sort(arr1, new IntegerReverseSort());
		//System.out.println(Arrays.toString(arr1));
	}

}
