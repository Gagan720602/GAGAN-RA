package com.gmail.inbox;


public  class Peace implements Runnable
{
	int i =0;
	synchronized public void incre()
	{
		i++;
		
	}
   synchronized public void decre()
   {
       i--;
	}	

public static void main(String...args)
{
	Peace p=new Peace();
	
	Runnable r=()->
	{
		p.incre();
		System.out.println(i);
	};
	
	Runnable r1=()->
	{
		p.decre();
		System.out.println(i);
	};
	
	Thread t=new Thread(r);
	Thread t1=new Thread(r1);
	r.start();
	r1.start();
	
}
}


