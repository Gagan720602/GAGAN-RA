package com.gmail.inbox;

public class Exp {
	
	public static void test(int n)
	{
		int i=50/n;
	}
	
	public static void main(String...args)
	{
		try
		{
			test(0);
		}
		catch(ArithmeticException  e)
		{
			System.out.println("peace");
			e.printStackTrace();
		}
		
	}

}
