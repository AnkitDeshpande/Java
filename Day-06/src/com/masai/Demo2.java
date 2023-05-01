package com.masai;

public class Demo2 {
	
	void fun(Student s1[]) {
		if(s1 != null) {
			for(Student stud : s1) {
				System.out.println("Name : "+stud.getName());
				System.out.println("Roll no : "+stud.getRoll());
				System.out.println("MArks : "+stud.getMarks());
				System.out.println("===========================");
			}
		}else {
			System.out.println("Invalid Credentials.");
		}
	}
	
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		
		Student s[] = new Student[3];
		
		Student s1 = new Student("Ankit", 1, 800);
		Student s2 = new Student("Sanket", 2, 850);
		Student s3 = new Student("Ravi", 3, 900);
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		
		d.fun(s);
	}
}
