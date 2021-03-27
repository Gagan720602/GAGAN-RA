package com.gmail.inbox;

import java.util.Arrays;

public class Anagram {
	public static boolean test(char a[],char b[])
	{
		if(a.length != b.length)
			return false;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0; i<a.length;i++)
		{ 
			if(a[i] !=b[i])
			{
				return false;
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		char a[]= {'g','g','a','a','n'};
		char b[]= {'g','a','g','a','n'};
	System.out.println(	test(a,b));

	}

}
