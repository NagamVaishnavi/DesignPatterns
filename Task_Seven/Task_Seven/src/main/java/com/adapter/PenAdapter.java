package com.adapter;
import com.animal.AdapterPen;

public class PenAdapter implements Pen{
	
	AdapterPen ap=new AdapterPen();
	

	public void write(String s) {
		
		ap.mark(s);
		
	}
	

}
