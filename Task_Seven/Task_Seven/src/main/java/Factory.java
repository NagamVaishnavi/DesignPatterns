import com.animal.Vehicle;
import com.animal.VehicleType;
public class Factory {
	public static void main(String args[])
	{
		VehicleType v=new VehicleType();
		Vehicle a= v.getInstance("small");
		a.type();
	}

}
