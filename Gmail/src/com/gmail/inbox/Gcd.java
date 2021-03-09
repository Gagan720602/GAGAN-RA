package com.gmail.inbox;

import java.util.Scanner;

public class Gcd {
	public static int test(int x,int z)
	{
		int gcd=0;
		for(int i=1;i<=x &&i<=z;i++)
		{
			if(x%i==0&&z%i==0)
			{
				gcd=i;
				
			}
		}
		return gcd;
	}

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
			
 System.out.println( test(s.nextInt(),s.nextInt()));
	}


}
