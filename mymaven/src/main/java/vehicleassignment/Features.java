package vehicleassignment;
import java.util.Scanner;

public class Features extends Vehicle
{
	String model;
	String make;
	String color; 
	int number;
	public void getvehicledetails()
	{
	Scanner sc=new Scanner (System.in); 
	System.out.println(vehicletype+ " model: "); 
	model=sc.nextLine();
	System.out.println(vehicletype+" make: "); 
	make=sc.nextLine();
	System. out.println(vehicletype+" color: "); 
	color=sc.nextLine();
	System.out.println(vehicletype+" number: ");
	number=sc.nextInt() ;

	}

}
