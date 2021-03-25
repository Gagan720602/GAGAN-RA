package com.java.oops;


		   abstract class Sample   // we can call class if it contains at least one abstract methods 
		   { 
		   	int Z=108;
		                                    // final , peivate , stactic  cant be declared as abstract methods 
		   	static double K=100.001;

		      abstract public void count();   // mathod which has only declaration but not initialized is call abstract method 

		       public  static void test()              // an abstrsct can contains concrete methods and abstract methods
		       {                                       
		       	System.out.println("peace");
		       }

		       public void ultra()
		       {
		       	System.out.println("legebdary peace");
		       }   
		    }

		   class Demo extends Sample                          //here demo class is concrete class 
		   {
		                                                  /*if the concrete class inherits from the absract class 
		                                                    " all the methods in the concrete class should overriden to all the abstract methods 
		                                                    in the abstract class  */
		     public void count()           
		                                   
		     {                       
		     	System.out.println("override of abstract method");
		     }
		   }

		   class Abstract
		   {
		      public static void main(String[] args)
		      {
		      	 Sample S;             
		      	 Demo D=new Demo();       // by creating the object we can call the sub class
		      	 D.count();                 // but cant create object of abstract class but can creacte refrence vaiable of abstract calss 
		      	 D.test();                  
		      	 D.ultra();
		      	 System.out.println(D.Z);
		      	 System.out.println(D.K);
		      }
		   }

	


