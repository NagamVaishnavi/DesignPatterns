package com.iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Repository n = new Repository();

	      for(Iterator iter = n.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name   : " + name);
	      } 	

	}

}
