package com.gmail.inbox;

public class Exception {
	public static void peace(int num)
	{
		  int g=100/num;
		 
	}
	public static void main(String...args)
	{
		try
		{
			peace(0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("chill bro");
			e.printStackTrace();
		}
		
	}

}
