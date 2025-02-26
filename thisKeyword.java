package com.basic;

class Student1{
	int rno;
	String sname;
	public Student1() {
		System.out.println("Default Constructor");
	}
	public Student1(int rno,String sname) {
		this();
		System.out.println("Parameterized Constructor");
		this.rno=rno;
		this.sname=sname;
	}
}
public class thisKeyword {

	public static void main(String[] args) {
		Student1  s1 =new Student1(1,"Nikhil");
	}
}
