package com.gmail.inbox;

public class Wrap {
	
	public static void main(String...args)
	{
		StringBuilder b=new StringBuilder("peace");
		StringBuilder b1=new StringBuilder("peace1");
		 String c="ultra";
		 String d="ultra";
		System.out.println(b);
		
		int a=10;
		Integer i=a;
		System.out.println(i);
		
		Long l=9591557009l;
		Long l1=Long.max(l, i);
		System.out.println(l1);
		System.out.println(b==b1);
		System.out.println(c==d);
	}

}
