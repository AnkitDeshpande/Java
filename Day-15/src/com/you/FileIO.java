package com.you;

import java.io.*;

public class FileIO {

	public static void main(String[] args) {

		String fileName = "abc.txt";
		String filteredFileName = "filtered.txt";
		String[] numbers = { "1234567890", "2345678901", "3456789012", "4567890123", "5678901234",
				"6789012345", "7890123456", "8901234567", "9012345678", "0123456789" };

		try (PrintWriter writer = new PrintWriter(new File(fileName))) {
			for (String number : numbers) {
				writer.println(number);
			}
			System.out.println("Numbers added to file " + fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
				PrintWriter writer = new PrintWriter(new File(filteredFileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.matches("[9,8,7,6]\\d{9}")) {
					writer.println(line);
				}
			}
			System.out.println("Filtered numbers written to file " + filteredFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			System.out.println("Contents of file " + fileName + ":");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (BufferedReader reader = new BufferedReader(new FileReader(filteredFileName))) {
			String line;
			System.out.println("Contents of file " + filteredFileName + ":");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
