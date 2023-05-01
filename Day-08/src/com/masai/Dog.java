package com.masai;

public class Dog extends Animal{

	public Dog(String name, int age, String gender) {
		super(name, age,gender);
		
	}
	
	@Override
	public void eat() {
		System.out.println(name+" is eating");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we cannot create object of abstract class.
		Animal a = new Dog("Shiro", 3, "male");
		a.eat();
	}

}

