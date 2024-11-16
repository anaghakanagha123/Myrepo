package vehicleassignment;

public class DisplayVehicleDetails extends Features {
	
	public void diplayVehicleDetails()
	{
	System.out.println("Vehicle Details");
	System.out.println("---------------------");
	System.out.println("Vehicle Type: "+vehicletype);
	System.out.println("Vehicle model: "+model);
	System.out.println("Vehicle make: "+make); 
	System.out.println("Vehicle color: "+color);
	System.out.println("Vehicle number: "+number);
	}

	public static void main(String[] args) {
		{
			DisplayVehicleDetails veh=new DisplayVehicleDetails(); 
			veh. getVehicleType();
			veh. getvehicledetails();
			veh.diplayVehicleDetails() ;
			}


	}

}
