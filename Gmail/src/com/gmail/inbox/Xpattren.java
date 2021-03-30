package com.gmail.inbox;

public class Xpattren {

	public static void main(String[] args)
	{
	int x[][]= {{1,0,0,0,0,0,1},{0,1,0,0,0,1,0},{0,0,1,0,1,0,0},{0,0,0,1,0,0,0},
			{0,0,1,0,1,0,0},{0,1,0,0,0,1,0},{1,0,0,0,0,0,1}
	};
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x.length;j++)
		{
			if(x[i][j]==1)
			{
				System.out.print('*');
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	}

}
