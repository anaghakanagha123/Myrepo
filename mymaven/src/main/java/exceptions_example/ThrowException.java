package exceptions_example;

public class ThrowException {
	int num1=2;
	int num2=4;
	
	
	public void check() {
		
if(num1<num2) {
			
			throw new IllegalArgumentException("num1<num2");
			
			}

	else {
	
		System.out.println("num1<num2");
		}
	}

	public static void main(String[] args) {
		ThrowException chk= new ThrowException();
		chk.check();
		
		
	}

}
