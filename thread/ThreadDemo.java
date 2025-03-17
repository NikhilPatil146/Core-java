package com.thread;

//class NewThread implements Runnable
//{
//
//	Thread t;
//	public NewThread() {
//		t=new Thread(this,"Child Thread");
//		t.start();
//	}
//	public void run() {
//		try {
//			for(int i=0;i<5;i++)
//			{
//				System.out.println(t+": "+i);
//				Thread.sleep(1000);
//			}
//		} catch (Exception e) {
//		  e.printStackTrace();	
//		}
//		System.out.println("Child Thread Existing");
//		
//	}
//	
//}
//class NewThread extends Thread
//{
//
//	public NewThread() {
//		super("Child Thread");
//		start();
//	}
//	public void run() {
//		try {
//			for(int i=0;i<5;i++)
//			{
//				System.out.println(this+": "+i);
//				Thread.sleep(1000);
//			}
//		} catch (Exception e) {
//		  e.printStackTrace();	
//		}
//		System.out.println("Child Thread Existing");
//		
//	}
//	
//}

class NewThread implements Runnable
{
    Thread t;
    String tname;
	public NewThread(String tname) {
		this.tname=tname;
		t=new Thread(this,tname);
		t.start();
	}
	public void run() {
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+": "+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		  e.printStackTrace();	
		}
		System.out.println("Child Thread Existing");
		
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {
	//	new NewThread();
		new NewThread("one");
		new NewThread("Two");
		new NewThread("Three");
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		System.out.println(t);
		t.setPriority(3);
		System.out.println(t);
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+": "+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		  e.printStackTrace();	
		}
		System.out.println("Main Thread Existing");
	}
}
