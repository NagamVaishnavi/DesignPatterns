package com.animal;

public class VehicleType {
	public Vehicle getInstance(String str)
	{
		if(str.equals("small"))
			return new Bike();
		else if(str.equals("large"))
			return new Car();
		else
			return new Auto();
	}

}
