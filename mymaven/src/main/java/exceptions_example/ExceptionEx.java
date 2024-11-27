package exceptions_example;

public class ExceptionEx {
	
	int a=4;
	int b=2;
	int res;
	int[] arr=new int[5];
	
	public void division() {
		
		try {
			
			res=a/b;
			System.out.println("Result: "+res);
			for(int i=0;i<=5;i++) {
				
				arr[i]=i+1;
				System.out.println(arr[i]);
				
				
			}
			
		}
		
		catch(ArithmeticException c) {
			
			System.out.println("number not divisible by 0");
			
		}
/*catch(ArrayIndexOutOfBoundsException x) {
			
			System.out.println("invalid array size");
			
		}*/
		catch(Exception p) {
			
			System.out.println("something went wrong");
		}
		
		finally {
			
			System.out.println("finally block");
			
		}

		
	}

	public static void main(String[] args) {
		ExceptionEx div=new ExceptionEx();
		div.division();

	}

}
