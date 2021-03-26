package com.gmail.inbox;

public class SwitchCase {
	public static void test(int opt)
	{
		switch (opt)
		{
		case 1:
			System.out.println("Apple");
			break;
		case 2:
			System.out.println("Ball");
			break;
		case 3:
			System.out.println("Cat");
			break;
		case 4:
			System.out.println("Dog");
			break;
		case 5:
			System.out.println("Elephant");
			break;
		case 6:
			System.out.println("Fox");
			break;
			default:
				System.out.println("INVALID input");
		}
	}

	public static void main(String[] args) {
		
		test(5);
		

	}

}
