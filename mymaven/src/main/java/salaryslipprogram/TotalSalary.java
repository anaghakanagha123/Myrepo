package salaryslipprogram;

public class TotalSalary extends HraPf {
	
	int total;
	
	public void totalSalCalc() {
		int totearn;
		int totded;
		totearn=bp+hra+bns;
		totded=pf+hra;
		total=totearn-totded;
		
	}
	
	public void printSalaryslip() {
		
		System.out.println("SALARY SLIP" );
		System.out.println("--------------");
		System.out.println("Basic pay: " +bp);
		System.out.println("Bonus: " +bns);
		System.out.println("Deduction" +deduc);
		System.out.println("HRA: " +hra);
		System.out.println("PF: " +pf);
		System.out.println("Total salary is: " +total);
		
		
	}

	public static void main(String[] args) {

		TotalSalary sal=new TotalSalary();
		sal.readcomps();
		sal.calcHraPf();
		sal.totalSalCalc();
		sal.printSalaryslip();
		

	}

}
