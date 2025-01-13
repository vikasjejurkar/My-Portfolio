package com.firstday.datatypes;

class mainClass{
	
	void main() {
		
		System.out.println("Great  Moring Sir");
	}
	
	
}

class SubClassOne extends mainClass{
	
	void one() {
		
		System.out.println("Great Moring vikas");
	}
	
}

class SubClassTwo extends mainClass {
	
	void two() {
		System.out.println("Great Moring hemant");
	}
	
}


public class MultipalData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClassTwo s=new SubClassTwo();
		s.main();
		s.two();
		
		

	}

}
