package com.masai;
import java.io.*;
public class BufferedReaderEx {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("xyz.txt",true);
		BufferedWriter bw = new BufferedWriter(f);
		
		bw.write(100);     //d will be added
		bw.newLine();
		bw.write("ramesh\nwelcome");
		bw.newLine();
		bw.write("india");
		bw.newLine();
		char ch[]={'a','b','c'};
	          bw.write(ch);
	          bw.newLine();

		bw.flush();
		bw.close();

		System.out.println("done");
	}
}
