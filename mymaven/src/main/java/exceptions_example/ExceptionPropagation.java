package exceptions_example;

import java.io.IOException;

public class ExceptionPropagation {
	
	public void check(int num1,int num2)throws IOException {
		
		if(num1<num2) {
					
					throw new IllegalArgumentException("num1<num2");
					
					}

			else {
			
				throw new IOException();
				}
			}
public void display() throws IOException {
	
	check(10,20);
	
}

	public static void main(String[] args) {
		ExceptionPropagation chk= new ExceptionPropagation();
		try {
		chk.display();
		}
		
		catch(IllegalArgumentException e) 
		{
			System.out.println("Illegal Argument Exception");
		}
		catch(IOException b){
			System.out.println("io exception");
		}

	}

}
