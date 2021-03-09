package com.gmail.inbox;

import java.util.Comparator;
import java.util.TreeSet;

public class MainTree {
	
	private int id;
	private String name;
	private double sal;
	
	
	
	public MainTree(int id, String name, double sal) {
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
		return "MainTree [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	class Sort implements Comparator<MainTree>
	{
		public int compare(MainTree t1,MainTree t2)
		{
			return t1.getId()-t2.getId();
			
		}
	}
	

	static TreeSet<MainTree> p;
	public static void peace()
	{
		p=new TreeSet<MainTree>();
		
		MainTree m1=new MainTree(3,"gagan",6466);
		MainTree m2=new MainTree(2,"gagan",6466);
		MainTree m3=new MainTree(1,"gagan",6466);
		MainTree m4=new MainTree(5,"gagan",6466);
		MainTree m5=new MainTree(6,"gagan",6466);
		MainTree m6=new MainTree(4,"gagan",6466);
		
		
		p.add(m1);
		p.add(m2);
		p.add(m3);
		p.add(m4);
		p.add(m5);
		p.add(m6);
	}
		
		public static void leend()
		{
	        p.stream()
			 .forEach(emp -> System.out.println(emp));
		}
	
	
	
	public static void main(String...args)
	{
		peace();
		leend();
		
	}

}
