package com.gmail.inbox;

import java.util.Scanner;

public class Fibinossi {
	
	public static void test(int o)
	{
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<=o;i++)
		{
			int sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			test(s.nextInt());

}
}
