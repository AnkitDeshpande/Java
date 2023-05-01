package com.masai;
import java.io.*;
public class FileHandlingEx2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw =new FileWriter("xyz.txt", true);
		fw.write(100);     //d will be added
		fw.write("\n");
		fw.write("ramesh\nwelcome");
		fw.write("\n");
		fw.write("india");
		fw.write("\n");
		char ch[]={'a','b','c'};
	          fw.write(ch);

		fw.flush();
		fw.close();

		System.out.println("done");
	}
}
