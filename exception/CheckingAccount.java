package com.exception;

public class CheckingAccount {

	int acno;
	String cname;
	double balance;
	public CheckingAccount(int acno, String cname, double balance) {
		this.acno = acno;
		this.cname = cname;
		this.balance = balance;
		System.out.println("Hello "+cname+" , Your Account Number "+acno+"Is Opened With "+balance+"Rs.");
	}
	public void deposite(double amount)
	{
		this.balance=this.balance+amount;
	}
	public void withdraw(double amount) throws InSufficientFund{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}
		else {
			throw new InSufficientFund(amount-this.balance);
		}
	}
	public void checkBalance() {
		System.out.println("Current Balance :"+this.balance);
	}

	
}
