package com.gmail.inbox;

import java.util.Scanner;

public class Factorial {
	public static int fact(int n)
	{
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			sum *=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
      System.out.println( fact(sc.nextInt()));
	}

}
