package com.you;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashingDemo {

	public static Map<Character, List<String>> addName(String names[]) {
		Map<Character, List<String>> map = new HashMap<Character, List<String>>();

		for (String name : names) {
			char firstLetter = name.charAt(0);
			if (!map.containsKey(firstLetter)) {
				map.put(firstLetter, new ArrayList<String>());
			}
			map.get(firstLetter).add(name);
		}
		return map;
	}

	public static void display(Map<Character, List<String>> map) {
		for (char c = 'A'; c <= 'Z'; c++) {
			if (map.containsKey(c)) {
				System.out.print(c + ": ");
				List<String> names = map.get(c);
				for (int i = 0; i < names.size() - 1; i++) {
					System.out.print(names.get(i) + ", ");
				}
				System.out.println(names.get(names.size() - 1));
			}
		}
	}

	public static boolean searchName(Map<Character, List<String>> map, String name) {
		char firstLetter = name.charAt(0);
		if (map.containsKey(firstLetter)) {
			List<String> names = map.get(firstLetter);
			for (String n : names) {
				if (n.equals(name)) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean removeName(Map<Character, List<String>> map, String name) {
		char firstLetter = name.charAt(0);
		if (map.containsKey(firstLetter)) {
			List<String> names = map.get(firstLetter);
			boolean removed = names.remove(name);
			if (names.isEmpty()) {
				map.remove(firstLetter);
			}
			return removed;
		}
		return false;
	}

	public static void main(String[] args) {
		String names[] = { "Naya", "Ishaan", "Jai", "Inaya", "Amar", "Navi", "Dhruv", "Kanan", "Diya",
				"Shyla", "Agastya", "Ananya", "Nila", "Tenzin", "Tamia", "Shaan", "Ajay",
				"Jaya", "Anjali", "Aditi", "Reva", "Sahil", "Darsh", "Aja", "Ambar", "Deven",
				"Ishani", "Kavi", "Marjane", "Jasleen", "Ashwin", "Aadhira", "Candy", "Kum",
				"Salina", "Artha", "Raghav", "Avan", "Sitara", "Shylah", "Divya", "Varun",
				"Sona", "Shaila", "Kimaya", "Farid", "Kashvi", "Devi", "Charu", "Mihir",
				"Tulsi", "Anila", "Anala", "Vivan", "Amitabh", "Mahika", "Sudhir", "Lata",
				"Anand", "Akshay" };

		Map<Character, List<String>> map = addName(names);

		System.out.println("The original map is ");
		display(map);

		System.out.println();
		if (searchName(map, "Farid")) {
			System.out.println("Name 'Farid' found in Map");
		} else {
			System.out.println("Name 'Farid' not found in Map");
		}

		System.out.println();
		if (searchName(map, "Harish")) {
			System.out.println("Name 'Harish' found in Map");
		} else {
			System.out.println("Name 'Harish' not found in Map");
		}

		System.out.println();
		if (removeName(map, "Lata")) {
			System.out.println("Name 'lata' removed from Map");
		} else {
			System.out.println("Name 'lata' not in map hence not deleted");
		}

		System.out.println();
		if (removeName(map, "Harish")) {
			System.out.println("Name 'Harish' removed from Map");
		} else {
			System.out.println("Name 'Harish' not in map hence not deleted");
		}

		System.out.println();
		display(map);
	}
}
