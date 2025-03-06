package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		
		hm.put(101,"Rajveer");
		hm.put(133,"Hetvi");
		hm.put(456,"Darshan");
		hm.put(33,"Rohit");
		hm.put(654,"Nikhil");
	
		System.out.println(hm);
		System.out.println(hm.get(5456));
		
		Set set= hm.entrySet();
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
