package abstraction_usingclass;
import java.util.Scanner;

public class Contractor extends Employee {
	
	float wrknghrs;
	
	public void calculateSalary() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter employee pay per hour: ");
		int payperhour=sc.nextInt();
		System.out.println("Enter employee working hours: ");
		float wrknghrs=sc.nextFloat();
		
		salary=payperhour*wrknghrs;
		
		System.out.println("Employee salary: "+salary);
	}
}
