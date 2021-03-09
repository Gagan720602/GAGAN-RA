package com.gmail.inbox;

import java.util.HashSet;
import java.util.Iterator;

public class MainHash {
	
	public static void main(String[]args)
	{
		HashSet<String> list=new HashSet<String>();
		
		list.add("gaan");
		list.add("milan");
		
		list.add("sujay");
		list.add(null); //only one null value allow
		list.add("ajay");
		list.add("gaan");//duplicates are removed 
		
		System.out.println(list);
		
		
		list.stream()
		    .filter(p -> p !=null)
		    .forEach(p ->System.out.println(p));
		
	System.out.println("");
	
	Iterator <String> l=list.iterator();
	{
		while(l.hasNext())
		{
		System.out.println(l.next());
		}
	}
  }
}
