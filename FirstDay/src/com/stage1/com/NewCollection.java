package com.stage1.com;

import java.util.LinkedList;



public class NewCollection {
	
	
	public static void main(String args[]) {
		
	//ArrayList
		
		LinkedList<String> V=new LinkedList<String>();
		
		V.addLast("Vikas");
		V.addFirst("Hemant");
		V.add("Kumar");
		System.out.println(V);
		V.add(1, "Ram");
		System.out.println(V);
		V.remove(0);
		System.out.println(V);
		V.clear();
		System.out.println(V);
		V.add("Ram");
		V.add("Sham");
		V.add("Adii");
		System.out.println(V);
		V.remove();
		System.out.println(V);

		
		
		
	}

}
