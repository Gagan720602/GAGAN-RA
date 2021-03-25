package com.java.oops;

class Sample
{
  public void ultra()
  {
  	System.out.println("ultra");
  }
}
class Demo extends Sample
{
   public void peace()
   {
   	System.out.println("peace");
   }
}
class Run extends Sample
{
   public void legend()
   {
   	System.out.println("legend");
   }
}
class CastClassException
{
	public static void main(String[] args) 
	{
		        Sample S=new Demo();
		        S.ultra(); //upcating

		         Run R= (Run)S; //cast Class cast exception 
  /*we cant downcast address of one subclass to another subclass ast it does not inherite tthe prpoerties */
	}	         
}
