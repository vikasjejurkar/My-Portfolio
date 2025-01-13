package com.firstday.datatypes;


class Parents{
	String name;
	int age;

	
	public void addData() {
		int a=5;
		int b=20;
		int c=a+b;
		
		System.out.println("Addition of two number is :"+c);
	}
	
	public static void subData() {
		
		int a=10;
		int b=5;
		int c=a-b;
		
		System.out.println("Subtraction of two numbber is :"+c);
	}
	
	public void  Parent(String name) {
		
		this.name=name;
		System.out.println("name"+this.name);
		
	}
	
	public  void Parents(String name,String string) {
		
		
		this.name=name;
		
		
		
		
		
		
	}
	
	
	 
		
}

     class child extends Parents{
	
	
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child  c= new child ();
		c.addData();
		c.subData();
		c.Parent("Vikas Boss");
		c.Parents("Name", "Vikas Don");
	}

}
