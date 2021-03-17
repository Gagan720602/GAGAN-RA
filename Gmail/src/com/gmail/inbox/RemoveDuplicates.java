package com.gmail.inbox;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	
	public static int test(int a[])
	{
		int temp[]=new int[a.length];
		int g=0;
		Arrays.sort(a);
		
	if(a.length==0||a.length==1)
		return a.length;
	
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]!=a[i+1])
		{
		  temp[g++]=a[i];	
		}		
	}
	temp[g]=a[a.length-1];
	
	for(int i=0;i<=g;i++)
	{
		a[i]=temp[i];
	}
	return g;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int g=test(a);
		
		for(int i=0;i<=g;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
