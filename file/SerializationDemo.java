package com.file;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Student implements Serializable
{
	int ro;
	String sname;
	double per;
	public Student(int ro, String sname, double per) {
		this.ro = ro;
		this.sname = sname;
		this.per = per;
	}
	
	public String toString() {
		return "Student [ro=" + ro + ", sname=" + sname + ", per=" + per + "]";
	}
	
}

public class  SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s1=new Student(1,"Nikhil",78.83);
		FileOutputStream fos=new FileOutputStream("ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		
		FileInputStream fis=new FileInputStream("ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s2=(Student) ois.readObject();
		System.out.println(s2);
		ois.close();
	}
}
