package com.gmail.inbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		List<Integer> l=new ArrayList<>();
		int i=0;
		while(a>0)
		{
	    l.add(a%2);
		a=a/2;
		i++;
		}
		
		for(int j=l.size()-1;j>=0;j--)
		{
			System.out.print(l.get(j)+" ");
		}
		
	}

}
