package com.gmail.inbox;

import java.util.ArrayList;
import java.util.List;



class Brand {
	String model;
	Integer speed;
	
	public Brand(String model, Integer speed) {
		super();
		this.model = model;
		this.speed = speed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Brand [model=" + model + ", speed=" + speed + "]";
	}
	

	
}
class BrandImplementation{
	
	public List<Brand> sortBySpeed(List<Brand> list){
//				for(int i=0;i<list.size();i++)
//				{
//					for(int j=0;j<list.size()-1;j++)
//					{
//						if(list.get(j).getSpeed()>list.get(j+1).getSpeed())
//						{
//				Object temp	= list.indexOf(list.get(j));
//				
//				
//				 = list.indexOf(j+1);
//						    
//							
//						}
//					}
//				}
		return list;
	}
	
	public long getCount(List<Brand> list)
	{
		int count=0;
		for(int i=0;i<list.size();i++)
		{
		if(list.get(i).getSpeed()>200)
		{
			count++;
		}
		}
		
	return count;
	}
}


public class Source {

	public static void main(String[] args)//throws Exception
	{
		List<Brand> list = new ArrayList<>();
		
		list.add(new Brand("SUV" , 500));
		list.add(new Brand("SEDAN" , 800));
		list.add(new Brand("SEDAN" , 600));
		
		BrandImplementation b = new BrandImplementation();
		System.out.println(b.sortBySpeed(list));
		System.out.print(b.getCount(list));
		
	}
}
