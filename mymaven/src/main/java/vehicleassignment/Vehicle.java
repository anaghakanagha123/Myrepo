package vehicleassignment;
import java.util.Scanner;

public class Vehicle {
	String vehicletype;

	public void getVehicleType()
	{
	Scanner sc=new Scanner (System. in);
	System.out.println("Vehicle Type: "); 
	vehicletype=sc.nextLine() ;
	}

}
