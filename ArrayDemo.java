 /*in this program include to
 how to array print
 sum of prints numbers
most imp Ascending / descending order */
package com.basic; 

import java.util.Scanner;

public class ArrayDemo {
 
	public static void main(String[] args) {
		int a[] = new int[5];
		int i,j,temp,sum=0;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter Array Elements");
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" Elements :");
			a[i] =sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of Array Elements :"+sum);
		System.out.println("Array Elements Are ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array Elements Are In Asceding Order ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array Elements Are Desceding Order ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}
		
	}
}
