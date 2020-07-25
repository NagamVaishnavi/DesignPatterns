package com.composite;

import java.util.ArrayList;
import java.util.List;

interface Component
{
	void showPrice();

	void addComponent(Component mon);
	
	
}

class Leaf implements Component{
	int price;
	String name;
	
	
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}


	public void showPrice()
	{
		System.out.println(name + ":" + price);
	}
	public void addComponent(Component com)
	{
		
		
	}

}

class Composite implements Component
{
	String name;
	
	
	public Composite(String name) {
		super();
		this.name = name;
	}
	List<Component> c = new ArrayList<Component>();
	
	public void addComponent(Component com)
	{
		c.add(com);
		
	}
	public void showPrice()
	{
		
		System.out.println(name);
		for(Component s:c)
		{
			s.showPrice();
		}
		
	}
}
