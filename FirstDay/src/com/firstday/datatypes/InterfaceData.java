package com.firstday.datatypes; 

interface Animal{
	
	 void walk();
	
}

class Cat implements Animal{
	
	void run() {
		System.out.println("Animal  is running");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.run();
	}

}
