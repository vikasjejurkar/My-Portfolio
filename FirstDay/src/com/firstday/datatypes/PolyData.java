package com.firstday.datatypes;

public class PolyData {
	String name;
	int age;
	
	public void printInfo() {
		
		System.out.println("Hello World!");
	}
	public void printInfo(String name) {
		this.name=name;
		System.out.println("Name"+this.name);
		
	}
	
	public void printInfo(int age) {
		this.age=age;
		System.out.println("age"+this.age);
	}
	
	public void printInfo(String name ,int age) {
		this.name=name;
		this.age=age;
		
		System.out.println(this.name +"-"+this.age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyData polyData=new PolyData();
		
		polyData.printInfo();
		polyData.printInfo("Rahul");
		polyData.printInfo(20);
		polyData.printInfo("Vikas", 21);

		
	}

}
