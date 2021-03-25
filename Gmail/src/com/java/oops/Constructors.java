package com.java.oops;
class Peace
{ 
  String name;  //global var 
  int id ;
  double sal;
  double peranuum;

  
  public Peace(String name,int id,double sal, double peranuum)//2 value stored in arguments (name ,id ,sal)r initialized to global variables  
  {
        this. name =name ;    // here we r using "this" to access the global variables inside the constructors
        this. id   = id;
        this. sal  = sal;
        this. peranuum=peranuum;
  }


  public void showdeal()//4 global var can be accessde anywhere in the class
  {
  	System.out.println(name);
  	System.out.println(id);
  	System.out.println(sal);
    System.out.println(peranuum);
  }

}
class Constructors
{
	public static void main(String[] args)
   {
		
	Peace G =new Peace("GAGAN",570,6788.098,451241.564);//1 we will pass inputs to consstructor peace 
  // new object is created contains data and function members of the class peace and its address is stored in G

	G.showdeal();//3 
}  
}