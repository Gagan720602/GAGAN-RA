package com.gmail.inbox;

import java.util.Scanner;

public class StringPalindrome {
	public static boolean test(StringBuffer s)
	{
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;		
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    StringBuffer s=new StringBuffer(sc.nextLine());	
    System.out.println(test(s));

	}

}
