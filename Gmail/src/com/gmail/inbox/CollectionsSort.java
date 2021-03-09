package com.gmail.inbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionsSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		
     Collections.sort(list);
     
     System.out.println("the max of list is= "+Collections.max(list));//return maximum in collection list
     
     System.out.println("the min int list is= "+Collections.min(list));//return minimum in collection list
     
   //  Collections.reverse(l);//prints the list in Decending order
     
     Collections.shuffle(list);//shuffle the list randomly
     
    
     System.out.println(list);
	}


}
