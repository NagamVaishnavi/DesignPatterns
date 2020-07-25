package com.adapter;
import com.animal.AdapterPen;
public class School {
	public static void main(String args[])
	{
		Pen pe=new PenAdapter();
		
		
		Assignment a=new Assignment();
		a.setP(pe);
		a.writeassignment("I have finished my Assignment");
	}

}
