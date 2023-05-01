package com.masai;

public class Demo3 {
	
	Student[] fun(String username, String password) {
		
		if(username.equals("admin") && password.equals("123")) {
			Student st[] = new Student[2];
			st[0] = new Student("s1", 10, 550);
			st[1] = new Student("s2", 11, 650);
			
			return st;
		}else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		Demo3 d = new Demo3();
	
		
		Student s1[] = d.fun("admin", "123");
		
		if(s1 != null) {
			for(Student stud : s1) {
				System.out.println("Name : "+stud.getName());
				System.out.println("Roll no : "+stud.getRoll());
				System.out.println("MArks : "+stud.getMarks());
				System.out.println("===========================");
			}
		}else {
			System.out.println("Invalid details.");
		}
	}
}
