package com.gmail.inbox;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MainExecuters
{
	public static  void main(String[]args)
	{
		Runnable r1=() ->
		{
			System.out.println("peace");
		};
		
		ExecutorService p=Executors.newFixedThreadPool(4);
		
		for(int i=0;i<5;i++)
		{
			p.submit(r1);
		}
		
		p.shutdown();
		
	}
}
