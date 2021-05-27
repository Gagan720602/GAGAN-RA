package com.gmail.inbox;

public class Accenture {

	public static int checkPassword(char str[], int n)
	{
		
		if(n<4)   
		{
			return 0;
		}
		for(int i=0; i<str.length;i++)
		{
			if(str[i]=='/')
			{
				return 0;
			}
		}
		if(str[0]>=0&& str[0]<=9)
		{
			return 0;
		}
		
		for(int i=0;i<str.length;i++)
		{
			
			for(int i=0;i<str.length;i++)
			{
				int g=str[i];
				if(g>=65&&g<=90)
				{
				checknumaric(str);
				break;
				}
			}
		}	
	public static int checknumaric(char str[])
	{

	    for(int k=0;k<str.length;k++)
	    {
	    	if(str[k]>=0&&st[k]<=9)
	    	{
	    		return 1;
	    	}
	    }
	    return 1;
		
	}
	}

	public static void main(String[] args) {
	char str[]= {'a','A','1','_','6','7'};
	checkPassword(str,6);

}
	}
