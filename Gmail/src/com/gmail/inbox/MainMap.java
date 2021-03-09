package com.gmail.inbox;

import java.util.HashMap;

public class MainMap {
	
	private int id;
	private String name;
	private double sal;
	public MainMap(int id, String name, double sal) {
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
		return "MainMap [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	public static void main(String[]args)
	{
		HashMap<Integer,MainMap> m=new HashMap<Integer,MainMap>();
		
		
		MainMap e1=new MainMap(1,"gagan",4654);
		MainMap e2=new MainMap(2,"milan",6654);
		MainMap e3=new MainMap(3,"ajay",654);
		MainMap e4=new MainMap(4,"sujay",3544);
		MainMap e5=new MainMap(5,"chiranth",54);
		MainMap e6=new MainMap(6,"gagan",455);
		
		m.put(e1.getId(), e1);
		m.put(e2.getId(), e2);
		m.put(e3.getId(), e3);
		m.put(e4.getId(), e4);
		m.put(e5.getId(), e5);
		m.put(e6.getId(), e6);
		
		
	System.out.println(m.get(5).toString());
	System.out.println(m.get(6).toString());
	e5.setSal(2000);
	System.out.println(m.get(5).toString());
	
	}

}
