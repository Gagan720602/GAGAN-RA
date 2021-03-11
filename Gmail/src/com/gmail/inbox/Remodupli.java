package com.gmail.inbox;
// Remove duplicate from the array
public class Remodupli {
	public static void test(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]!=a[j])
				{
					System.out.print(i+" ");
				}
			}
		}
	}
	

	public static void main(String[] args) {
		
int nums[]= {1,5,5,6,7,7,8,6,9,8};
test(nums);
	}

}
