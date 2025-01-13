package com.firstday.datatypes;



class Grandfather{
	
	void addData() {
		
		int a=10;
		int b=10;
		int c=a+b;
		
	    System.out.println("Addition of two number is :"+c);
	}
		
		
		
}

class Mummy extends Grandfather {
	
	void SubData() {
		
		int a=5;
		int b=3;
		int c=a-b;
		
		
		System.out.println("Subtraction of two number is :"+c);
	}
	
	
}

class Dautger extends  Mummy{
	
	void MulData() {
		
		int a=10;
		int b=2;
		int c=a*b;
		
		
		
		System.out.println("Multiplication of two number is :"+c);
	}
	
	
} 
public class DataBase {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Dautger s=new  Dautger();
		 
		 s.addData();
		 s.SubData();
		 s.MulData();
		
		
		
		

	}

}
