package SuperKeywordAsmnt;

public class CheckDivisible extends Addition {
	int tot;
	public void divisible(int num1, int num2)
	{
	tot=super.checkTotal(num1,num2) ;
	int res=tot%10;
	if (res == 0)
	{
	System.out.println("number is divisible by 10");
	}
	else
	System. out.println("number is not divisible by 10");
	}


	public static void main(String[] args) {
		
		CheckDivisible div=new CheckDivisible();
		div. divisible (10,30); 
		div. divisible (11,32);


	}

}
