package com.stage1.com;


//class MyThread implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		System.out.println("MyThread");
//	}
//	
//}

class MyThreadd extends Thread{
	public void run() {
		try {
			Thread.sleep(4000);
			System.out.println("MyThread 1");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}


public class RunnableData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyThread m=new MyThread();
		Thread.sleep(4000);
		System.out.println("Hello MyThread ");
		
		m.start();
	}

}