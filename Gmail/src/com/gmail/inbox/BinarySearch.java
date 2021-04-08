package com.gmail.inbox;


public class BinarySearch {
	public static boolean test(int []a,int key)
	{
		int low=0;
		int high=a.length-1;
		int mid;
		for(int i=0;i<a.length;i++)
		{
			mid=(low+high)/2;
			
			if(key==a[mid])
			{
				return true;
			}
			else if(key>a[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
			
		}
		return false;
		
		
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
	System.out.println(test(a,5));

	}

}
