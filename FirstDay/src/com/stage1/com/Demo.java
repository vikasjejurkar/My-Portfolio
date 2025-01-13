package com.stage1.com;

class A{
	
	void add() {
		int a=10;
		int b=50;
		int c=a+b;
		
		System.out.println("Addition of two numm er is : "+c);
	}
	
}
class B extends A{
	
	void sub() {
		
		int a=100;
		int b=50;
		int c=a-b;
		
		System.out.println("Subtraction of two number is: "
				+c);
	}
	
}

class C extends B{
	
	void mul() {
		
		int a=100;
		int b=50;
		int c=a*b;
		
		System.out.println("Multiplication of two number is :"+c);
	}
}

public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C  c=new C();
		c.add();
		c.sub();
		c.mul();
	}

}
