package com.gmail.inbox;

import java.util.Vector;

public class MianVector {
	private int id;
	private String name;
	private double sal;
	
	
	
	public MianVector(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	


	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getSal() {
		return sal;
	}




	public void setSal(double sal) {
		this.sal = sal;
	}




	@Override
	public String toString() {
		return "[" + id + ", " + name + ", " + sal + "]";
	}

public static void main(String[]args)
{
	Vector< MianVector> v=new Vector<MianVector>();
	 
	MianVector e1=new MianVector(1,"gagan",4654);
	MianVector e2=new MianVector(2,"milan",6654);
	MianVector e3=new MianVector(3,"ajay",654);
	MianVector e4=new MianVector(4,"sujay",3544);
	MianVector e5=new MianVector(5,"chiranth",54);
	MianVector e6=new MianVector(6,"gagan",455);
	
	
	
	v.add(e1);
	v.add(e2);
	v.add(e3);
	v.add(e4);
	v.add(e5);
	v.add(e6);
	
	v.stream()
	.forEach(g-> System.out.println(g.toString()));
	
	System.out.println("");
	
	for(int i=0;i<v.size();i++)
	{
		System.out.println(v.get(i).toString());
	}
	
	
	
}
	
	

}
