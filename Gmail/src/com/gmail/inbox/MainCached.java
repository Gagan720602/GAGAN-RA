package com.gmail.inbox;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainCached {
	public static void main(String[]args)
	{
		Runnable n=() ->
		{
			System.out.println("bob");
		};
		
		ExecutorService e=Executors.newCachedThreadPool();
		
		for(int i=0; i<5;i++)
		{
			e.submit(n);
		}
		e.shutdown();
	}

}
