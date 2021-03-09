package com.gmail.inbox;

public class SwapNo {
	public static void test(int a,int b)
	{
		System.out.println("numbers before swaping a="+ a);
		System.out.println("numbers before swaping b="+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("numbers after swaping a="+ a);
		System.out.println("numbers after swaping b="+ b);
	}

	public static void main(String[] args) {
		test(10,20);	
	}

}
