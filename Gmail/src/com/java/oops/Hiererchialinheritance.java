package com.java.oops;

class Account
{
    String Ownername="gagan";
    long   accno    =451645135;
    double bal      = 300000;    // bal or principle P or rupees invested
    
    public void depsite( double amt)
    {
       bal =bal+amt;
    }

    public void withdraw(double amt)
    {
       bal = bal - amt;
    }


}
class Savings extends Account
{
    double R=0;// rate of intrestR
   double i;      //expected intrest 
   int t;   

    public Savings(double I ,int T)
    {
    	this.i=I;
    	this.t=T;
    }

   public void calculateROI()
   {
        R=i/bal*t;
        System.out.println(R);
   }
}
class Current extends Account
{
   public void showmainbal()
   {

   }
}
class Hiererchialinheritance
{
	public static void main(String[] args) 
	{
		 Current C = new Current();
		 Savings S= new Savings(100000,5);
		 S.calculateROI();
	}
}