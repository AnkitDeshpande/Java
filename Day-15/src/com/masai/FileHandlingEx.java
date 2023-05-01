package com.masai;
import java.io.*;
public class FileHandlingEx {
	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		System.out.println(f);
		System.out.println(f.exists());
		
		f.createNewFile();
		System.out.println(f.exists());
	}
}
