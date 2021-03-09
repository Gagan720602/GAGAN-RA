package com.gmail.inbox;

public class MainSynchro {
	
	static String s=new String("HELLOW");
	
	
	
	public static void main(String...args)
	{
		Runnable r=()->
		{
			synchronized(s)
			{
			s=s.concat("gagan");
			
			System.out.println(s);
			}
		};
		
		Runnable r1=()->
		{
			synchronized(s)
			{
			s=s.concat("ganja");

			System.out.println(s);
			}
			
		};
		
		Thread t=new Thread(r);
		Thread t1=new Thread(r1);
		t.start();
		t1.start();
		
		
		}
	}


