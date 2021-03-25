package com.gmail.inbox;

import java.util.Scanner;

public class Sum {
	public static double test(int n)
	{int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        System.out.println(test(sc.nextInt()));
        
	}

}
