package com.firstday.datatypes;


abstract class Plant{
	
	abstract void Flower();
}

 class Rose extends Plant{
	
	void Color() {
		
		System.out.println("Color of Flower is Red.");
	}

	@Override
	void Flower() {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rose r=new Rose();
		r.Color();
		r.Flower();
	}

}
