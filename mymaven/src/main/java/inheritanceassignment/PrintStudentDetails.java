package inheritanceassignment;

import java.util.Scanner;

public class PrintStudentDetails extends Student
 {
	int mark;
	public void stdmark() {
	
	Scanner sc=new Scanner (System. in); 
	System.out.println("Enter student mark: ");
	mark=sc.nextInt();
	}
	public void displayStudentDetails()
	{
	System. out. println("student Name: "+sname) ;
	System.out .println("student ID: "+sid);
	System.out. println("Student Age: "+sage) ;
	System.out. println("Student Mark: "+mark) ;
	}

	public static void main(String[] args) {
		
		PrintStudentDetails std=new PrintStudentDetails(); 
		std.fetchStudentDetails();
		std.stdmark();
		std.displayStudentDetails();
		

	}

}
