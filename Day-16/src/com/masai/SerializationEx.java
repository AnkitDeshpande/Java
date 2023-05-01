package com.masai;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		A a= new A();
		a.i=20;
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(a);
		
		System.out.println("Serailized............");
	}

}
