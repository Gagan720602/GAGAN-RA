package com.gmail.inbox;

public class StringM {
	
	public static void Su(String a,String b)
	{
		int sum=1;
		int sum1=1;
		for(int i=0;i<a.length();i++)
		{
			int g=a.charAt(i);
			
			
			g=g-48;
		
			sum=sum*g;
		}
		
		
		for(int i=0;i<b.length();i++)
		{
			int r=b.charAt(i);
			
			
			r=r-48;
		
			sum1=sum1*r;
		}
		System.out.println(sum*sum1);
	}

	public static void main(String[] args) {
	 String a="101";
	 String b="100";
		Su(a,b);

	}

}
