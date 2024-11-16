// Program to find factorial of a number using this and constructor
package practiceprojectspkg;

import java.util.Scanner;

public class ThisFactPtc {
	
	int num;
	int fact=1;
	
	public ThisFactPtc(int num) 
	{
		
	this.num=num;
	for(int i=1;i<=num;i++) 
	{
		fact=fact*i;
	}
	
	}
	public ThisFactPtc() {
		this(10);
		System.out.println("The factorial of number is: "+fact);
	}

	public static void main(String[] args) {
		
		ThisFactPtc obj=new ThisFactPtc();
	}

}
