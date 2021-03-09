package com.gmail.inbox;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainScheduled {
	
	public static void main(String[]args)
	{
		Runnable n=()->
		{
			System.out.println("peace");
		};
		
		Runnable n1=()->
		{
			
			System.out.println("ultra");
		};
		
		ScheduledExecutorService p=Executors.newScheduledThreadPool(8);
		
		p.schedule(n,3,TimeUnit.SECONDS);
		
		p.scheduleAtFixedRate(n1, 2, 3, TimeUnit.SECONDS);
	}

}
