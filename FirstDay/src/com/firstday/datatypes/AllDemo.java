package com.firstday.datatypes;

//Creating Inheritance
class c1{
	void add() {
		
	
	int a=10;
	int b=10;
	int c=a+b;
	
	System.out.println("Additon of two number is :"+c);
	
	}
	
}
class c2 extends c1{
	
	void  sub() {
		
		int a=10;
		int b=5;
		int c=a-b;
		
		System.out.println("Subtraction of two number is :"+c);
	}
	
}
class c3 extends c2{
	
	void mul() {
		
		int a=10;
		int b=5;
		int c=a*b;
		System.out.println("Multiplication of two number is :"+c);
	}
	
}




public class AllDemo {
	
	
	
	void name() {
		
		System.out.println("Hello Vikas");
	}
	
	void age() {
		
		System.out.println("age=21");
	}
	void city() {
		
		System.out.println("City=Rahata");
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c3 c=new c3();
		c.add();
		c.sub();
		c.mul();
		
		AllDemo w=new AllDemo();
		w.name();
		w.age();
		w.city();
		
		
		

	}

}
