package com.gmail.inbox;

import java.util.Comparator;
import java.util.PriorityQueue;


class Lagend implements Comparator<MainQueue2>
{
	public int compare(MainQueue2 emp1,MainQueue2 emp2)
	{
		return emp2.getId()-emp1.getId();
	}
}

public class MainQueue2 {
	private int id;
	private String name;
	private double sal;
	
	
	
	public MainQueue2(int id, String name, double sal) {
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
		return " [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	static  PriorityQueue<MainQueue2> q;
	
	public static void peace()
	{
	
	 q=new PriorityQueue<MainQueue2>();
	
	MainQueue2 m1=new MainQueue2(3,"gagan",6466);
	MainQueue2 m2=new MainQueue2(2,"milan",6466);
	MainQueue2 m3=new MainQueue2(1,"vijay",6466);
	MainQueue2 m4=new MainQueue2(5,"thalapathi",6466);
	MainQueue2 m5=new MainQueue2(6,"peace",6466);
	MainQueue2 m6=new MainQueue2(4,"ajay",6466);
	
	q.add(m1);
	q.add(m2);
	q.add(m3);
	q.add(m4);
	q.add(m5);
	q.add(m6);
	}
	public static void ultra()
	{
		while(q.isEmpty()==false)
		{
			System.out.println(q.poll().toString());
		}
	}
	
	public static void main(String[]args)
	{
		peace();
		ultra();
	}
	
	
	
	

}


