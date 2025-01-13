package com.stage1.com;

import java.util.ArrayList;


public class PracLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		
       list.add("Hello Sir.");
       list.add(1, "Hello vikas.");
       list.add("Hello Hemant.");
       list.add(0, "Good Morning sir.");
       
       for(int i=0;i<list.size();i++) {
    	   
    	   System.out.println("At the Morning time in the office :"+list.get(i));
   
       }
	}

}
