package com.masai;
import java.io.*;
public class FileReaderEx {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("xyz.txt");
//		int i1 = fr.read();
//		int i2 = fr.read();
//		int i3 = fr.read();
//		int i4 = fr.read();
		
		
//		System.out.println(i1+" "+i2+" "+i3+" "+i4);
//=========================================================
//		while(i1 !=-1) {
//			System.out.println((char)i1);
//			i1 = fr.read();
//		}
//=========================================================	
		
		File f = new File("xyz.txt");
		System.out.println(f.length());
		
		char[] ch = new char[(int)f.length()];
		
		fr.read(ch);
		
		for(char c : ch) {
			System.out.print(c); ///what if the length of file is greater than the length of Integer range?
		}
	}
}
