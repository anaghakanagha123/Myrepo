package methodoverridingasngmt;

import java.util.Scanner;

public class Onseason extends OffSeason {

public void discount(int item1,int item2,int item3) {
	total=item1+item2+item3;
	int discount=(40*total)/100;
	int billamnt=total-discount;
	
	System.out.println("Total amount= "+total);
	System.out.println("Discount= "+discount);
	System.out.println("Onseason Bill Amount= "+billamnt);

}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter item price 1: ");
		int item1=sc.nextInt();
		System.out.println("Enter item price 2: ");
		int item2=sc.nextInt();
		System.out.println("Enter item price 3: ");
		int item3=sc.nextInt();
		
		
		Onseason obj=new Onseason();
		obj.discount(item1,item2,item3);
		OffSeason obj1=new OffSeason();
		obj1.discount(item1,item2,item3);

	}

}
