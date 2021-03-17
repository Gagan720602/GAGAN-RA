package com.design.pattrens;

public class Product {
	
		private static final Product pro=new Product();
		
		private Product()
		{
			System.out.println(" yes object is created ");
		}
		
		public static Object getInstance()
		{
			return pro;
		}

}
