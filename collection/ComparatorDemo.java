package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo implements Comparator<Emp> {

	public int compare(Emp e1,Emp e2) {
		int value=0;
		if(e1.getSalary()>e2.getSalary())
		{
			value=-1;
		}
		else if(e1.getSalary()<e2.getSalary())
		{
			value=1;
		}
		else if(e1.getSalary()==e2.getSalary())
		{
			value=0;
		}
		return value;
	}
	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.setEid(1);
		e1.setEname("Rajveer");
		e1.setSalary(25000);
		
		Emp e2=new Emp();
		e2.setEid(2);
		e2.setEname("Hetvi");
		e2.setSalary(28000);
		
		Emp e3=new Emp();
		e3.setEid(3);
		e3.setEname("Rahul");
		e3.setSalary(21000);
		
		Emp e4=new Emp();
		e4.setEid(4);
		e4.setEname("Rohit");
		e4.setSalary(33000);
		
		Emp e5=new Emp();
		e5.setEid(5);
		e5.setEname("Darshan");
		e5.setSalary(19000);
		
		Emp e6=new Emp();
		e6.setEid(6);
		e6.setEname("Nikhil");
		e6.setSalary(30000);
		
		ArrayList<Emp> list=new ArrayList<Emp>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
	   Collections.sort(list,new ComparatorDemo());
	   
	   for(Emp e:list)
	   {
		   System.out.println("EID : "+e.getEid()+"ENAME: "+e.getEname()+"SALARY: "+e.getSalary() );
	   }
		
	}
	
	
}
