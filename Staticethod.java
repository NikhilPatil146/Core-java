package com.basic;

public class Staticethod {

	static int a=10;
	static int b;
	{
		System.out.println("Block 1");
	}
	static void meth(int x)
	{
		System.out.println("X :"+x);
		System.out.println("A :"+a);
		System.out.println("B :"+b);
	}
	static
	{
      System.out.println("Static Block Initialized");
      b=a*4;
	}
	public Staticethod() {
		System.out.println("Default Constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main Method Called");
		meth(12);
		Staticethod s1=new Staticethod();
	}
	{
		System.out.println("Block 2");
	}
}
