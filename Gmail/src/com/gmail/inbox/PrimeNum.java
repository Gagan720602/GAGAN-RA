package com.gmail.inbox;

import java.util.Scanner;

public class PrimeNum {
	static boolean primecheck(int n)
	{
		 if(n<=1)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
		    return false;
			}
		}
			return true;	
	}
	
	public static void test(int a)
	{
		for(int i=2;i<a;i++)
		{
			if(primecheck(i))
			{
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	test(s.nextInt());
	s.close();
	}

}
