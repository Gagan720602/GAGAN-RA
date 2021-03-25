package com.java.oops;
class Global_var
{
	static int G;    
	 //global variable default valuue is stored by compiler it self
 
 public static void local(int P)//local variable   //3
 {
     int G=10;      
       //local variable val should be initializer else error by compiler
    System.out.println("localvar="+G) ;//4//8
    System.out.println("localvar="+P);//5//9
    System.out.println(""+Global_var.G);//6 //10
     //here we should asige the value of global variable using classmember else it cant be access insisde the method
 }
 public static void main(String[] args) {
 	System.out.println("globalvar="+G);  //1
 	local( 0);  //2
 	local(98);  //7     
 	//inside the same class no need to call the class name in static to static
 }

}


