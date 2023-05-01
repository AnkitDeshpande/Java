package com.masai;
import java.io.*;
public class CreateFolder {
	public static void main(String[] args) {
		File f = new File("MyFolder");
		
		System.out.println(f.exists());          //false
		
		f.mkdir();
		
		System.out.println(f.exists());        //true
	}
}
