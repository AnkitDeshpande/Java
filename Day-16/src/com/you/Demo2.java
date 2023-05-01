package com.you;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

class Demo2 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentdata.ser"))) {
			while (true) {
				Student s = (Student) ois.readObject();
				students.add(s);
			}
		} catch (EOFException ex) {
			// End of file reached
		} catch (IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}

		for (Student s : students) {
			System.out.println(s);
		}
	}
}