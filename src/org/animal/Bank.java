package org.animal;

public class Bank {
	
	
	
	public Bank(int salary) {
		
		this();
		
		System.out.println("my salary:"+salary);
		
		
	}
	
	public Bank () {
		
	System.out.println("default constructor");
	
	System.out.println("yezhu changed");
	}
	
	public static void main(String[] args) {
		
	Bank a = new Bank();
		
		Bank b = new Bank(2000);
		
		
		
	}
	
	
	
	
	
	
	

}
