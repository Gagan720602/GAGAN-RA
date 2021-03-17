package com.design.factorypattern;
abstract class Vehical {
	
	 abstract void wheel();
}

class Car extends Vehical{
	@Override
	public  void wheel()
	{
		System.out.println("car has 4 wheel");
	}
	
}
class Bike extends Vehical{
	@Override
	public  void wheel()
	{
		System.out.println("bike has 2 wheel");
	}
	
}
class Spring 
{
	public static Vehical  getInstance(int pin)
	{
		Vehical v;
		if(pin==123)
		{
			v=new Car();
		}
		else
		{
			v=new Bike();
		}
		return v;
				
	}
}

public class FactoryPattern {

	public static void main(String[] args) {
		Spring s=new Spring();
	 Vehical obj=s.getInstance(025);
	   obj.wheel();
	   
	
		

	}

}
