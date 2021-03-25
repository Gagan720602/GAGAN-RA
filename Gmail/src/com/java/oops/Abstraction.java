package com.java.oops;
interface User 
{
   public void transfer ();
} 


class Webpage implements User
{
 // @Override
  public void transfer()
  {
  	System.out.println("trancation throught Webpage");
  }
}


class Atmuser implements User
{
// @Override
 public void transfer()
  {
  	System.out.println("trancation throught Atmuser");
  }
}


class Spring
{
    public User userobj( int pin)
    {
    	User ref;
    	if(pin == 123)
    	{
    		ref=new Webpage();
    		System.out.println("object of Webpage is created");
    		return ref;
    	}
    	else
    	{
    		ref=new Atmuser();
    		System.out.println("object of Atmpage is created");
    		return ref;
    	}
    }
}
class Abstraction
{
	public static void main(String[] args) 
	{
		Spring S=new Spring();

		User ref =S.userobj(123);
		ref.transfer();

        System.out.println("");

		User ref1 =S.userobj(85664);
		ref1.transfer();
	}
}
