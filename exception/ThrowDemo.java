/*Difference Between Throw & Throws
 * 
 * Throw                         Throws
 * 1.It is declared within       1.It is declared with method signature
 * try block and in method
 * body
 * 2.You can only throw one      2.you can Throws multiple exception at a time
 * Exception at a time
 * 3.Throw worked with an        3.Throws worked with directly any runtime exception class
 * object of any Runtime 
 * Exception
 * 4.It is used to throw an      4.It is used to declare an exception
 * Exception
*/
package com.exception;

import java.util.Scanner;

public class ThrowDemo {

	public static void demo() {
		int x;
		Scanner sc=new Scanner(System.in);
		try 
		{
		System.out.print("Enter X: ");
		x=sc.nextInt();
		
		if(x>0)
		{
			System.out.println("Square of "+x+" Is : "+(x*x));
		}
		else
		{
			throw new ArithmeticException();
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please Enter Positive Value Only");
		}
	}
	public static void main(String[] args) {
		demo();
	}
}
