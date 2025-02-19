package com.basic;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
//		int n;
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter N :");
//		n=sc.nextInt();
//		while(n>0)
//		{
//			System.out.println("Tops Technology");
//			n--;
//		}
//		int n, sum=0;
//		Scanner sc=new Scanner(System.in);
//		System.err.println("Enter N :");
//		n=sc.nextInt();
//		while(n>0)
//			{
//			 sum=sum+n;
//			 n--;
//			}
//		System.out.println("Sum "+sum);
		
		int n, sum=0;
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter N :");
		n=sc.nextInt();
		   do
			{
			 sum=sum+n;
			 n--;
			}while(n>0);
		System.out.println("Sum : "+sum);
	}
}
 