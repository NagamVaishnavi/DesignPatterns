package com.observer;
import java.util.ArrayList;
import java.util.List;
public class Channel {

	private List<Subscriber> sub = new ArrayList<Subscriber>();
	
	String tittle;
	
	public void subscribe( Subscriber s)
	{
		sub.add(s);
	}
	public void unSubscribe( Subscriber s)
	{
		sub.remove(s);
	}
	public void notifySubscriber()
	{
		for(Subscriber s:sub)
		{
			s.update();
		}
	}
	public void upload(String tittle)
	{
		this.tittle=tittle;
		notifySubscriber();
		
	}
	
	
}
