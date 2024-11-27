package interface_assignment;
import java.util.Scanner;
public class HDFC implements Rbi {
	
	
	public double recurringDeposit(double dpstamnt, int duration) {
		double maturityAmount;
		maturityAmount = dpstamnt + (dpstamnt * INTRST * duration);
		System.out.println("Interest Rate: "+INTRST);
		System.out.println("Maturity mount after depositing  "+dpstamnt+" Rupees for "+duration+" months duration is "+maturityAmount);
		return maturityAmount;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HDFC rd=new HDFC();
		double depositAmount;
		int timePeriod;
		System.out.println("Enter Deposit amount: ");
		depositAmount = sc.nextDouble();
		System.out.println("Enter Time period (in months):");
		timePeriod = sc.nextInt();
		rd.recurringDeposit(depositAmount,timePeriod);


	}

	

}
