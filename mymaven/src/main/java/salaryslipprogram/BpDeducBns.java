
package salaryslipprogram;
import java.util.*;
public class BpDeducBns {
	
	int bp;
	int deduc;
	int bns;
	
	public void readcomps() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic pay: ");
		bp=sc.nextInt();
		System.out.println("Enter Deduction: ");
		deduc=sc.nextInt();
		System.out.println("Enter Bonus: ");
		bns=sc.nextInt();
	
	}

}
