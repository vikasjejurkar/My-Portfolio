package com.firstday.datatypes;


class a1{
	
	void p1() {
		
		System.out.println("Vikas");
	}
	
	
}

class a2 extends a1{
	
	void p2() {
		
		System.out.println("Hemant");
	}
}

class a3 extends a2{
	
	void p3() {
		
		System.out.println("Omkar");
	}
}

class a4 extends a3{
	
	void p4() {
		
		System.out.println("Rushikesh");
	}
}
public class HybridData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a4 x=new a4();
//		x.p1();
//		x.p2();
//		x.p3();
//		x.p4();
		
		x.p4();
		x.p1();

	}

}
