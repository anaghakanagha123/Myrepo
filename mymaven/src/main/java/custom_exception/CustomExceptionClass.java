package custom_exception;

public class CustomExceptionClass {
		
	public void InvalidAge(int age) throws MycustomException
	{
		
		if(age<18) {
			
			throw new MycustomException("my exception message");//executes super(msg);
			
		}
		
		else
		{
			System.out.println("age is valid");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		CustomExceptionClass exc= new CustomExceptionClass();
		try {
		exc.InvalidAge(17);
		}
		catch(MycustomException e ){
			System.out.println("invalid");
			System.out.println(e.getMessage());
			
		}
	}

}
