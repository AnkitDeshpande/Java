package com.you;

import java.io.*;
import java.util.*;

class Demo1 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "John", 90, "password1",
				new Address("Karnataka", "Bangalore", 560001)));
		students.add(new Student(2, "Jane", 85, "password2", new Address("Kerala", "Kochi", 682001)));
		students.add(new Student(3, "Jim", 80, "password3", new Address("Tamil Nadu", "Chennai", 600001)));
		students.add(new Student(4, "Julia", 75, "password4",
				new Address("Andhra Pradesh", "Hyderabad", 500001)));
		students.add(new Student(5, "Jake", 70, "password5", new Address("Maharashtra", "Mumbai", 400001)));

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentdata.ser"))) {
			for (Student s : students) {
				oos.writeObject(s);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

