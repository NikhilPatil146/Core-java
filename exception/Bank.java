package com.exception;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double amount;
		System.out.println("Enter Account Number :");
		int acno=sc.nextInt();
		System.out.println("Enter Customer Name :");
		String cname=sc.next();
		System.out.println("Enter Initial Balance :");
		int balance=sc.nextInt();
		System.out.println("*********************************************");
		CheckingAccount c=new CheckingAccount(acno,cname,balance);
		System.out.println("*********************************************");
	while(true)
	{
		System.out.println("1.Deposite");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Balance");
		System.out.println("4. Exit");
		System.out.println("*********************************************");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		System.out.println("*********************************************");
		
		if(choice==1)
		{
			System.out.println("Enter Deposit Amount :");
			amount=sc.nextDouble();
			c.deposite(amount);
			System.out.println("*********************************************");
		}
		else if(choice==2)
		{
			try {
				System.out.println("Enter Deposit Amount :");
				amount=sc.nextDouble();
				c.withdraw(amount);
				System.out.println("*********************************************");
			}catch(InSufficientFund e) {
				System.out.println("Sorry You Need Another "+e.getAmount()+"Rs.");
				System.out.println("*********************************************");
			}
		}
		else if(choice==3) {
			c.checkBalance();
			System.out.println("*********************************************");
		}
		else if(choice==4) {
			System.out.println("Thank You for Using Our Services.");
			System.out.println("*********************************************");
		}
		else {
			System.out.println("Invaid Choice. Please Try Again");
			System.out.println("*********************************************");
		}
	}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
