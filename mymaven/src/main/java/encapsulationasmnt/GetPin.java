package encapsulationasmnt;
import java.util.Scanner;

public class GetPin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
       System.out.print("Enter your PIN: ");
       int usrpin = sc.nextInt();
       
       Bank bnk = new Bank();
       bnk.setPin(usrpin);
       
       System.out.println("User pin: " + bnk.getPin());
       bnk.validatePin();

	}

}
