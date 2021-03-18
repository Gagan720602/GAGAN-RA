package com.design.builder;

class Vehical
{
	private double engine;
	private int wheel;
	
	private int airbags;

	public double getEngine() {
		return engine;
	}	
	public int getWheel() {
		return wheel;
	}
	public int getAirbags() {
		return airbags;
	}
	
	private Vehical(VehicalBuilder Builder)
	{
		this.engine=Builder.engine;
		this.wheel=Builder.wheel;
		
		this.airbags=Builder.airbags;
		
	}
	public static class VehicalBuilder
	{
		private double engine;
		private int wheel;
		
		private int airbags;

		public VehicalBuilder(double engine, int wheel) {
			super();
			this.engine = engine;
			this.wheel = wheel;
		}

		public VehicalBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}
		
		public Vehical build()
		{
		return new Vehical(this);
		}
		
	}

}

public class BuilderPattern {

	public static void main(String[] args) {
		Vehical car=new Vehical.VehicalBuilder(1000.5, 4).setAirbags(4).build();
		Vehical bike=new Vehical.VehicalBuilder(223.25,2).build();
		
		System.out.println("car Engine capacity "+car.getEngine());
		System.out.println("car Number of Wheels "+car.getWheel());
		System.out.println("car NO of airbags "+car.getAirbags());
		

		System.out.println();
		
		System.out.println("bike Engine capacity "+bike.getEngine());
		System.out.println("bike Number of Wheels "+bike.getWheel());
		System.out.println("bike NO of airbags "+bike.getAirbags());
		
		

	}

}
