package com.gmail.inbox;

import java.util.Scanner;

public class Bubblesort {
	
	public static void test(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		
  int []a=new int[s.nextInt()];
  
  for(int i=0;i<a.length;i++)
  {
	  a[i]=s.nextInt();
  }
	test(a);
	
	}

}
