package org.animal;

public class Animal {
	
	
	
	
	public  Animal (){	
		
		
		System.out.println("Default Constructor");
	}
	
	
	Animal (int age){
		this();
		System.out.println("parameterized constructor:" + age);
		
	}
	
	public static void main(String[] args) {
		Animal ani=new Animal(24);
		Animal mal =new Animal();
		
		
	}
	
	
	
	
	

}
