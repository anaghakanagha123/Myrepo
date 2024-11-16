package practiceprojectspkg;

import java.util.Scanner;

public class ReverseOrderptc {
	
	int num;
	public void revordr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		for(int i=num;i>=0;i--) 
		{
			System.out.print(i+",");
		}
	}
	public static void main(String[] args) {
		
		ReverseOrderptc ord=new ReverseOrderptc();
		ord.revordr();
	}

}
