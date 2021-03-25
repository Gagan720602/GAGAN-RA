package com.gmail.inbox;

class Unicodecasting
{
  public static void ultra(char a1) 
    {
  		int i=a1;
  		 if(i>=65 &&i<=90)
  		 {
  		 	System.out.println( i+" is uppercase");
  		 }
  		 else if(i>=97 &&i<=123)
  		 {
  		 	System.out.println(i+" is lower case");
  		 }
  		 else
  		 {
  		 	System.out.println("is not a alphabet");
  		 }
  	}
  	public static void main(String[] args) 
  	    {
  			ultra('z');
  		}	
}
