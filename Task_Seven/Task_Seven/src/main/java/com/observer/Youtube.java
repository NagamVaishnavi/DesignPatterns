package com.observer;

public class Youtube {

	public static void main(String[] args) {
		Channel epam=new Channel();
		
		Subscriber s1=new Subscriber("Amulya");
		Subscriber s2=new Subscriber("Vaishnavi");
		Subscriber s3=new Subscriber("Navya");
		Subscriber s4=new Subscriber("Bindhu Meghana");
		Subscriber s5=new Subscriber("Bhavya");
		
		
		epam.subscribe(s1);
		epam.subscribe(s2);
		epam.subscribe(s3);
		epam.subscribe(s4);
		epam.subscribe(s5);
		
		s1.subcribeChannel(epam);
		s2.subcribeChannel(epam);
		s3.subcribeChannel(epam);
		s4.subcribeChannel(epam);
		s5.subcribeChannel(epam);
		
		epam.unSubscribe(s5);
		
		epam.upload("exam details");
		
	}

}
