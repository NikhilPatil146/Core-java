package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.10);
		al.add("tops");
		al.add('t');
		al.add(null);
		al.add(true);
		al.add(10);
		
		System.out.println(al);
		System.out.println(al.get(4));
		System.out.println(al.indexOf(true));
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf(10));
		al.remove(3);
		System.out.println(al);
		al.set(5, 101);
		System.out.println(al);
		System.out.println("---Iterator---");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("---List Iterator---");
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next() + " Tops");
		}
		litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
//		
		System.out.println("---List Iterator Reverse---");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}	
	}
}
