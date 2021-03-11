package com.gmail.inbox;

import java.util.Scanner;

public class Intpalindrom {
	
  public static void test(int nums)
  {
	  int rem,temp=nums;
     int sum=0;
   
     while(nums>0)
     {
    	rem =nums%10;
    	nums=nums/10;
    	sum=sum*10+rem;
     }
  System.out.println(temp==sum?true:false);
  
  }
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		test(sc.nextInt());
	}

}
