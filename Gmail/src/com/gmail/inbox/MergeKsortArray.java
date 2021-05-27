/*k = 3, n = 4 
arr[][] = { {1, 3, 5, 7}, 
{2, 4, 6, 8}, 
{0, 9, 10, 11}} ;
Output: 0 1 2 3 4 5 6 7 8 9 10 11 */

package com.gmail.inbox;

import java.util.Arrays;

public class MergeKsortArray {
	
	public static void mergeSort(int arr[][], int k, int n)
	{
		int g=0;
		int a[]=new int[k*n];
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[g]=arr[i][j];
				g++;
			}
		}
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
	
		int arr[][] = { {1, 3, 5, 7}, 
				{2, 4, 6, 8}, 
				{0, 9, 10, 11}} ;
		int k=3;
		int n=4;
		
		mergeSort(arr,k,n);
	
	}

}
