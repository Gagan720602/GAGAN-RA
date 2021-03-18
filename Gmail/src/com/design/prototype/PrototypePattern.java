package com.design.prototype;

import java.util.ArrayList;
import java.util.List;

class Vehical implements Cloneable 
{
 private ArrayList<String> Vehiclelist;
 
 public Vehical()
 {
	 this.Vehiclelist = new ArrayList<String>();
 }

public Vehical(ArrayList<String> list) {
	super();
	this.Vehiclelist = list;
}
 
public void insertdata()
{
	Vehiclelist.add("Lamborgini");
	Vehiclelist.add("Audi");
	Vehiclelist.add("Rolls Royce new dawn & pantom");
	Vehiclelist.add("jai Maruthi 800");
	Vehiclelist.add("scoda");
}

public ArrayList<String> getVehiclelist() {
	return this.Vehiclelist;
}

@Override
public Object clone()
{
	ArrayList<String> templist=new ArrayList<String>();
	for(String g:this.getVehiclelist()) {
		templist.add(g);
		}
	return new Vehical(templist);
	
}

}

public class PrototypePattern {

	public static void main(String[] args) {
		Vehical a=new Vehical();
		a.insertdata();
		System.out.println(a.getVehiclelist());
		
		Vehical b=(Vehical)a.clone();
		List<String> copy=b.getVehiclelist();
		copy.add("Dorge Demon SRT challenger");
		System.out.println(copy);
	
		b.getVehiclelist().remove("Lamborgini");
		System.out.println(copy);
		
		System.out.println(a.getVehiclelist());

		
	}

}
