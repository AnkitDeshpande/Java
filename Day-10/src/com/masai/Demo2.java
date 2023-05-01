package com.masai;

import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLClientInfoException;

public class Demo2 {
	
	
	public void fun() throws ClassNotFoundException, FileAlreadyExistsException, SQLClientInfoException{
		System.out.println("Inside fun");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		
		Demo2 d = new Demo2();
		try {
			d.fun();
		} catch (FileAlreadyExistsException | ClassNotFoundException | SQLClientInfoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main ends");
	}

}
