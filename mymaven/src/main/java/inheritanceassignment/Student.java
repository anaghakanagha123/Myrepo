
package inheritanceassignment;
import java.util.Scanner;
public class Student {
	int sid;
	String sname;
	int sage;

	public void fetchStudentDetails()
	{
	Scanner sc=new Scanner (System. in); 
	System.out.println("Enter student ID: ");
	 sid=sc.nextInt();
	System.out.println("Enter student Name: "); 
	sname=sc.next();
	System.out.println("Enter student Age: ");
	sage=sc.nextInt() ;
	}

}
