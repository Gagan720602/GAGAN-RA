package com.gmail.inbox;

import java.util.Scanner;

public class LinerSearch {
	
	public static boolean test(int []a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the length of the array");
	    int a[]=new int[sc.nextInt()];
	    System.out.println("enter the elements of the array");
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    System.out.println("enter the key value to be searched");
	    
	    System.out.println(	test(a,sc.nextInt()));	

	}

}
