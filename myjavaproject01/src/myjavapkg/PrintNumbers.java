package myjavapkg;

public class PrintNumbers {
	
	public void printnums(int n1)
	{
		int i=0;
		System.out.println("i= "+i);
		
		while(i<=n1) 
		{
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumbers obj=new PrintNumbers();
		obj.printnums(10);
	}

}
