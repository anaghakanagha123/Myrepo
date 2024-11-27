package abstraction_usingclass;
import java.util.Scanner;

public class FullTimeEmployee extends Employee {
	
	public static final int FULLTIMEWORKINGHOURS=8;
	
public void calculateSalary() {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Full time Employee pay per hour: ");
		int payperhour=sc.nextInt();
		salary=payperhour*FULLTIMEWORKINGHOURS;
		
		System.out.println("Full Time Employee salary: "+salary);
		
	}

	public static void main(String[] args) {
		
		Contractor cntctr=new Contractor();
		cntctr.calculateSalary();
		FullTimeEmployee ftemp=new FullTimeEmployee();
		ftemp.calculateSalary();

	}

}
