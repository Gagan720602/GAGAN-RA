package com.gmail.inbox;
import java.util.*;
import java.io.*;

public class StackDemo {
	
	public static void main(String...args)
	{
	
	    // Default initialization of StackDemo 
      
		Stack<String> g=new Stack<String>();
		
		
		g.push("gagan");
		g.push(null);
		g.push("milan");
		g.push("ajay");
		
		System.out.println(	g);
		System.out.println(g.size());
		
		for(int i=0;i<=g.size();i++)
		{
				System.out.println(	g.pop());
		}
		
		
		System.out.println(	g.pop());
		
		System.out.println(g.size());
		
		
				
	}

}
