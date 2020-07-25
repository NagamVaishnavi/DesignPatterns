import java.lang.*;
import java.io.*;
@SuppressWarnings("unused")
class Diagram{
	
	public static Diagram d;
	private Diagram() {}
	public static Diagram getInstance()
	{
		return d;
	}
	public void show()
	{
		System.out.println("Hi");
	}

}

public class Singleton{
	public static void main(String args[]) throws NullPointerException
	{
		Diagram d=Diagram.getInstance();
		
		
	}

}
