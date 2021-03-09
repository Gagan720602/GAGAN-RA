package com.gmail.inbox;
import java.util.ArrayList;

public class MainList {
	
	private int id;
	private String name;
	private double sal;
	
	
	
	public MainList(int id, String name, double sal) {
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
		
		ArrayList<MainList>  g=new ArrayList<MainList>();
		
		MainList e1=new MainList(1,"gagan",4654);
		MainList e2=new MainList(2,"milan",6654);
		MainList e3=new MainList(3,"ajay",654);
		MainList e4=new MainList(4,"sujay",3544);
		MainList e5=new MainList(5,"chiranth",54);
		MainList e6=new MainList(6,"gagan",455);
		
		g.add(e1);
		g.add(e2);
		g.add(e3);
		g.add(e4);
		g.add(e5);
		g.add(e6);
		
		
		for(int i =0;i<g.size();i++)
		{
			System.out.println(g.get(i));
		}
		
		System.out.println("");
		
		g.stream()
		 .forEach(m -> System.out.println(m.toString()));
		
		System.out.println("");
		
		g.stream()
		 .filter(d -> d.getSal()>5000)
		 .forEach(d -> System.out.println(d.toString()));
		
		System.out.println("");
		
		g.stream()
		 .filter(l-> l.getName()=="gagan")
		 .forEach(l -> System.out.println(l.toString()));
	}

}
