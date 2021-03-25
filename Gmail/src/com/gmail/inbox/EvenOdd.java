package com.gmail.inbox;

import java.util.Scanner;

public class EvenOdd {
	public static void  test(int a)
	{
		if(a%2==0)
		{
			System.out.println("even");
		}
		System.out.println("odd ");
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
   	test(sc.nextInt());

	}

}
