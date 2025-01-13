package com.firstday.datatypes;

interface  A{
	
	 void a();
	
}

class B implements A{
	
	void b() {
		
		System.out.println("Great Monring Vikas");
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B c=new B();
		
			c.a();
			c.b();
	}

}
