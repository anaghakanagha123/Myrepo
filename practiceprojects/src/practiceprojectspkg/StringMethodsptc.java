package practiceprojectspkg;

public class StringMethodsptc {

	public static void main(String[] args) {
		
		//STRING REVERSE
		
		//Approch 1 --- length() & charAt()
		
		String str1="welcome";
		String rev="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
		}
		System.out.println("Reveresed string is: "+rev);
		
		//Approch 1 --- by convering string to char array type
		
		String str2="anagha";
		String rev1="";
		
		char a[]=str2.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			rev1=rev1+str2.charAt(i);
		}
		System.out.println("Reversed string= "+rev1);
	}

}
