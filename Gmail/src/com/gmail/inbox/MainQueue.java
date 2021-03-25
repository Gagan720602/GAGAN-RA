package com.gmail.inbox;

import java.util.PriorityQueue;

public class MainQueue {
	
	public static void main(String []args)
	{
		PriorityQueue<Integer> p =new PriorityQueue<Integer>();
		
		p.add(1);
		p.add(2);
		p.add(3);
		p.add(5);
		p.add(9);
		
		System.out.println(p.size());
		System.out.println(p.poll());
		System.out.println(p.poll());
		
		
 		while(p.isEmpty()==false)
		{
			System.out.println(p.poll());
		}
		
		System.out.println(p.poll());
	}

}
