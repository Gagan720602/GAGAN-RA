package com.gmail.inbox;

import java.util.Scanner;

public class AmstrongNum {
	
	public static boolean test(int nums)
	{
		int temp=nums ;int sum=0;
		while(nums>0)
		{
		int a=nums%10;
		sum =sum+a*a*a;
		nums=nums/10;
		}
		if(temp==sum)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println(test(sc.nextInt()));
		
	}

}
