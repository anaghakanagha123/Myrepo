package methodoverridingasngmt;
import java.util.Scanner;

public class OffSeason {
	int total;
	public void discount(int item1,int item2,int item3) {
		total=item1+item2+item3;
		int discount=(15*total)/100;
		int billamnt=total-discount;
	
		System.out.println("Total amount= "+total);
		System.out.println("Discount= "+discount);
		System.out.println("Off seasonBill Amount= "+billamnt);
		
	}
}
