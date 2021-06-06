package com.gmail.inbox;

import java.util.Arrays;

public class MergeSor {
	
	public static void msort(int []arr1,int []arr2)
	{
		int arr[] = new int[arr1.length + arr2.length];
		
		for(int i=0;i< arr1.length ;i++)
		{
			arr[i] = arr1[i];
		}
	
		
		for(int i=0 ;i< arr2.length;i++)
		{
			arr[arr1.length+i] = arr2[i];
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	
	}

	public static void main(String[] args) {
		int arr1[]= {5,3,58,1,3,9,41};
		int arr2[]= {6,2,47,9,2,3,4,6};
		
		msort(arr1,arr2);
		

	}

}
