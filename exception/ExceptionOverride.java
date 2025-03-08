package com.exception;

import java.util.InputMismatchException;

class Ex1 
 {
	 void show () throws Exception
	 {
		 System.out.println("Show from Ex1");
	 }
 }
 
 class 	Ex2 extends Ex1
 {
	 void show () throws InputMismatchException
	 {
		// super.show();
		 System.out.println("Show from Ex2");
	 }
 }
public class ExceptionOverride {

	public static void main(String[] args) {
		Ex2 e=new Ex2();
		e.show();
	}
}
