package com.firstday.datatypes;

class Parent{
	
	 void addData() {
		
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println("Addition of two number is :"+c);
	}
}

class Child extends Parent{
	
	void subData() {
		
		
		int a=100;
		int b=50;
		int c=a-b;
		
		System.out.println("Subtraction of two number is :"+c);
	}
	
	
}
class SecondChid extends Child{
	
	void mulData() {
		
		int a=100;
		int b=5;
		int c=a*b;
		
		System.out.println("Multiplication of two number is :"+c);
		
	}
	
	
}



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SecondChid c=new SecondChid();
		c.addData();
		c.subData();
		c.mulData();
	

	}

}
