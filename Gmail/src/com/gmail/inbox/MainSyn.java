package com.gmail.inbox;

public class MainSyn {
	
	static int i=0;
	 synchronized public static void incre()
	
	{
		i++;
	}
	synchronized public  static void decre()
	{
		i--;
	}
	
	public static void main(String[]args)
	{
		Runnable r=()->
		{
			incre();
			System.out.println(i);
		};
		
		Runnable r1=()->
		{
			decre();
			System.out.println(i);
		};
		
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(r1);
		
		t1.start();
		t2.start();
		
	}

}
