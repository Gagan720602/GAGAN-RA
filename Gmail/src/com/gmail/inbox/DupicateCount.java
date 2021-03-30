package com.gmail.inbox;

import java.util.Arrays;

public class DupicateCount {
	
	public static void test(int a[])
	{
		int x[]=new int[a.length];
		int count=0;
		int k=0;
		for(int i=0; i<a.length;i++)
		{ 
			count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				count++;
				
				}
			
			}
			x[k]=count;
			k++;
			
		}
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,1,5,3};
		test(a);

	}

}
