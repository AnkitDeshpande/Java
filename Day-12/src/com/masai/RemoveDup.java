package com.masai;
import java.util.*;
public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		Set<Integer> set = new LinkedHashSet<>(l); //converts arryList to set
		
		System.out.println(set);
		
		
		l = new ArrayList<>(set); // converts set back to array List;
		System.out.println(l);  // but number will not return back to it previous state;
	}

}
