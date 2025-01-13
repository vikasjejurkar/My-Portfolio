package com.stage1.com;

import java.util.ArrayList;

class JavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated metho d stub
		
		
		ArrayList<String> N=new ArrayList<String>();
		N.add("Vikas");
		N.add("Hemant");
		N.add("Kartik");
		System.out.println(N);
		N.add("Sagar");
		System.out.println(N);
		N.add(1, "Mayur");
		System.out.println(N);
		N.remove(2);
		System.out.println(N);
		N.clear();
		System.out.println(N);


		

	}

}
