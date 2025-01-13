package com.firstday.datatypes;

public class PolyData1 {
	
	int age;
	String name;
	char names;
	float number;
	long num;

	
	public static void printInfo() {
		System.out.println("Hello Vikas");
		
		
	}
    public void printInfo(String name) {
    	
    	this.name=name;
    	System.out.println("Name"+this.name);
		
		
	}
    public  void printInfo(int age) {
    	this.age=age;
    	
    	System.out.println("Age"+this.age);
	
	
     }
    public void  printInfo(String name,int age) {
    	
    	this.name=name;
    	this.age=age;
    	
    	System.out.println(this.name+"="+this.age);
    	
    	
    }
    public void printInfo(float number) {
    	this.number=number;
    	
    	System.out.println("Number"+this.number);
    	
    }
    

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolyData1 polyData1=new PolyData1();
		polyData1.printInfo("Vikas");
		polyData1.printInfo(21);
		polyData1.printInfo("Hemant", 21);
		polyData1.printInfo(0);
		
		
		

	}

}
