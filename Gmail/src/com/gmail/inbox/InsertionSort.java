  package com.gmail.inbox;

import java.util.Arrays;

public class InsertionSort {
	static void insort(int x[])
	{
		for(int i=1;i<x.length;i++)
		{
			int key=x[i];
			int j=i-1;
					while(j>=0 && x[j]>key)
					{
						x[j+1]=x[j];
						j--;
					}
					x[j+1]=key;
					
		}
		
		System.out.println(Arrays.toString(x));
		
	}

	public static void main(String[] args) {
		int []s= {12,11,13,5,6,50,0};
        insort(s);
	}

}
