package vehicleassignment;
import java.util.Scanner;

public class DisplayVehicleDetails extends Features {
	String nodoors;
	public void vehicleDoortype() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Vehicle Door type: "); 
		nodoors=sc.next() ;
	}
	
	public void diplayVehicleDetails()
	{
	System.out.println("Vehicle Details");
	System.out.println("---------------------");
	System.out.println("Vehicle Type: "+vehicletype);
	System.out.println("Vehicle model: "+model);
	System.out.println("Vehicle make: "+make); 
	System.out.println("Vehicle color: "+color);
	System.out.println("Vehicle number: "+number);
	System.out.println("Vehicle Door type: "+nodoors);
	}

	public static void main(String[] args) {
		{
			DisplayVehicleDetails veh=new DisplayVehicleDetails(); 
			veh. getVehicleType();
			veh.vehicleDoortype();
			veh. getvehicledetails();
			veh.diplayVehicleDetails() ;
			}


	}

}
