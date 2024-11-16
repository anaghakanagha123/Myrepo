package inheritanceassignment;


public class PrintStudentDetails extends Student
 {
	
	int mark;
	
	public void displayStudentDetails()
	{
	System. out. println("student Name: "+sname) ;
	System.out .println("student ID: "+sid);
	System.out. println("Student Age: "+sage) ;
	}

	public static void main(String[] args) {
		
		PrintStudentDetails std=new PrintStudentDetails(); 
		std.fetchStudentDetails();
		std.displayStudentDetails();

	}

}
