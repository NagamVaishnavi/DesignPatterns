package com.composite;

public class CompositeTest {

	

	public static void main(String args[])
	{
		Component hd = new Leaf(4000,"Hard Disk");
		Component m = new Leaf(1000,"Mouse");
		Component k = new Leaf(1500,"Key Board");
		Component cpu = new Leaf(7000,"SSD");
		Component mon = new Leaf(10000,"Monitor");
		
		Component ph=new Composite("Peripheral");
		Component c=new Composite("Cabinet");
		Component mb=new Composite("Mother Board");
		Component cp=new Composite("Computer");
		
		ph.addComponent(m);
		ph.addComponent(mon);
		
		
		c.addComponent(hd);
		
		
		mb.addComponent(cpu);
		
		cp.addComponent(ph);
		cp.addComponent(c);
		cp.addComponent(mb);
		
		hd.showPrice();
		
		
		ph.showPrice();
		
		
		
	}
}
