package com.gmail.inbox;

public class Exception2 {
	
	public static void peace(int num )throws InterruptedException
	
	{
	  Thread.sleep(num);
	  System.out.println("peace");
	  
	  
	}
	public static void main(String...args)
	{
		
		try
		{
			peace(5);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			
		}
		
	}

}
