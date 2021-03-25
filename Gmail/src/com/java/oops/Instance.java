package com.java.oops;

class Customer extends Object
{
  public void buy()
  {
    System.out.println("buy the product");
  }
  
    public void cancel()
  {
    System.out.println("cancel the product");
  }

}
class Admin extends Object
{
    public void add()
  {
    System.out.println("add the product");
  }
  
    public void remove()
  {
    System.out.println("remove the product");
  }
}
class Login 
{
   public void login(Object ref) //upcasting
   {
    if( ref instanceof Customer) //instance of compaires object reference variable to class properties ,return true if it contains else not 
    {
      Customer Ct=(Customer) ref; //downcasting
      Ct.buy();
      Ct.cancel();
    }
    else
    {
       Admin Ct=(Admin) ref; //downcasting
      Ct.add();
      Ct.remove();
    }
   }
}
class Instance
{
 public static void main(String[] args) 
 {

   Login L=new Login();
   Customer C=new Customer();
   L.login(C);

   System.out.println("");
   
   Admin    A=new Admin();
    L.login(A);
 }
}


		        