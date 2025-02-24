package com.basic;

public class MethodOvearloading {
	
	void test()
	{
		System.out.println("test with no arguments");
	}
	
	void test(int a)
	{
		System.out.println("test with 1 arguments");
	}
	
	void test(int a, int b)
	{
		System.out.println("test with 2 arguments");
	}

	public static void main(String[] args) {
		MethodOvearloading m= new MethodOvearloading();
		m.test(10);
		m.test(10,20);
		m.test();
	}
}
