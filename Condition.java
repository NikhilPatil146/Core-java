package com.basic;

import java.util.Scanner;

public class Condition {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
//	int a,b;
//	System.out.print("Enter A :");
//	a=sc.nextInt();
//	System.out.println("Enter B :");
//	b=sc.nextInt();
	
	//if-else
//	if(a>b)
//	{
//		System.out.println("a is greater than b");
//	}
//	else {
//		System.out.println("a is Less than b");
//	}
	
	//Ladder if 
//	int score;
//	System.out.println("Enter Score :");
//	score=sc.nextInt();
//	if(score >= 90)
//		{
//			System.out.println("Grade: A");
//		}
//		else if(score >= 80) {
//			System.out.println("Grade : B");
//		}
//		else if(score >= 70) {
//			System.out.println("Grade : C");
//		}
//		else {
//			System.out.println("Grade : D");
//		}
//	
//	 int n;
//	 System.out.println("Enter Number :");
//	 n=sc.nextInt();
//	 
//	 if(n % 2 == 0) {
//		 System.out.println("Even");
//		 if(n % 6 == 0) {
//			 System.out.println("Number is divided by 6");
//		 }
//		 else {
//			 System.out.println("Number is not divide by 6 ");
//		 }
//	 }
//	 else {
//		 System.out.println("Odd");
//		 if(n % 3 == 0)
//		 {
//			 System.out.println("Number is Divided by 3");
//		 }
//		 else {
//			 System.out.println("Number is not Divivded by 3");
//		 }
//	 }
//	 
	 
	 int a,b,c;
		System.out.print("Enter A :");
		a=sc.nextInt();
		System.out.print("Enter B :");
		b=sc.nextInt();
		System.out.print("Enter C :");
		c=sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("A is Max Value");
			}
			else {
				System.out.println("C is Max Value");
			}
		}
		else if (b>c) {
			System.out.println("B is Max Value");
		}
		else {
			System.out.println("C is Max Value");
		}
		
	
}
}
