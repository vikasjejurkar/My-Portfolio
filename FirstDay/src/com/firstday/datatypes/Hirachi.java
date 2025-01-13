package com.firstday.datatypes;

class Parentdemo {

	void car() {

		System.out.println("Mustang");
	}

}

class C1 extends Parentdemo {
	void bike() {

		System.out.println("Ninja h2");
	}

}

class C2 extends Parentdemo {

	void cycle() {

		System.out.println("Harculus");
	}

}

public class Hirachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1 c = new C1();
		c.car();
		c.bike();

		C2 cz = new C2();
		cz.car();
		cz.cycle();

	}

}
