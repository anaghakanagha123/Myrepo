package encapsulation;

public class DisplayAcctDetails {

	public static void main(String[] args) {
		AccountDetails obj=new AccountDetails();
		obj.setBlnc(1000);
		obj.interest();
		obj.setName("Anagha");
		System.out.println("Name: "+obj.getName());
		System.out.println("Balance "+obj.getBlnc());

	}

}
