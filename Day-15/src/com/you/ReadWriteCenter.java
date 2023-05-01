package com.you;

import java.io.*;
import java.util.*;

public class ReadWriteCenter {
	private File file;
	private String contentToWrite;
	private String contentToAppend;

	public ReadWriteCenter(String filename, String contentToWrite, String contentToAppend) {
		this.file = new File(filename);
		this.contentToWrite = contentToWrite;
		this.contentToAppend = contentToAppend;
	}

	public void writeToFile() {
		try {
			FileWriter writer = new FileWriter(file);
			writer.write(contentToWrite);
			writer.close();
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
	}

	public void appendToFile() {
		try {
			FileWriter writer = new FileWriter(file, true);
			writer.write(contentToAppend);
			writer.close();
		} catch (IOException e) {
			System.out.println("An error occurred while appending to the file.");
			e.printStackTrace();
		}
	}

	public List<Integer> getAnalysis() {
		List<Integer> analysis = new ArrayList<>();
		try {
			FileReader reader = new FileReader(file);
			int c;
			int digitCount = 0;
			int letterCount = 0;
			int symbolCount = 0;
			while ((c = reader.read()) != -1) {
				if (Character.isDigit(c)) {
					digitCount++;
				} else if (Character.isLetter(c)) {
					letterCount++;
				} else {
					symbolCount++;
				}
			}
			reader.close();
			analysis.add(digitCount);
			analysis.add(letterCount);
			analysis.add(symbolCount);
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
		}
		return analysis;
	}
}
