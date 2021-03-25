package com.gmail.inbox;

public class Pattern {
		 // Compiler version JDK 11.0.2		
		  public static void main(String[] args)
		    {
		    int n=5,a=1,b=1;
		    for(int i=0;i<n;i++)
		    {
		      for(int j=0;j<=i;j++)
		      {
		        System.out.print(" ");
		      }
		      
		      for(int k=n;k>i;k--)
		      {
		        if(b%2==0)
		        {
		          System.out.print("_ ");
		        }
		        else
		        {
		          System.out.print(a+" ");
		          a++;
		        }
		        b++;
		      }
		      System.out.println();
		    }
		  }
		
	

}
