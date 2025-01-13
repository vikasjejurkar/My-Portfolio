package com.stage1.com;

class MyThread extends Thread{
	public void run() {
		
		try {
			Thread.sleep(4000);
			System.out.println("My Thread 1");
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
	}
	
	
}

public class DayLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
