package com.observer;

public class Subscriber {
	private String name;
	private Channel channel = new Channel();
	
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	public void update()
	{
		System.out.println("Hey "+ name + ", New Vedio got Uploaded:  " +channel.tittle);
	}
	public void subcribeChannel(Channel c)
	{
		channel=c;
	}
	

}
