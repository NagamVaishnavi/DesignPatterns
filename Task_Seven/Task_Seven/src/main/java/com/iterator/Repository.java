package com.iterator;

public class Repository implements Container{
	
	public String names[] = {"Amulya" , "Vaishnavi" ,"Navya" , "Meghana"};

	public Iterator getIterator() {
		
		return new Name();
	}

	
	private class Name implements Iterator
	{
		int i;
		public boolean hasNext() {
			
			if(i < names.length){
	            return true;
	         }
	         return false;
		}

		public Object next() {
			
			if(this.hasNext()){
	            return names[i++];
	         }
	         return null;
		}
		
	}

}
