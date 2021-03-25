package com.gmail.inbox;

import java.util.Scanner;

public class Vowels {
	


		public static int  peace(String v)
		{
			int count =0;
	        for(int i=0;i<v.length();i++)
	        {
	        	char ch=v.charAt(i);
	        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	        	{
	        		count ++;
	        	}
	        }
	        return count;
		} 
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
		System.out.println("the no of Vowels is "+ peace(sc.nextLine()));
		}
	}


