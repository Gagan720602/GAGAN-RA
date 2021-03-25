package com.gmail.inbox;

import java.util.Arrays;

public class SwapNos {

	public static void main(String[] args) {
	
int a[]= {10,20};

a[0]=a[0]+a[1];
a[1]= a[0]-a[1];
a[0]=a[0]-a[1];

for(int i=0;i<a.length;i++)
{
	System.out.print(Arrays.toString(a));
}


	}

}
