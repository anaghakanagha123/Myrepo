package aggregationasmnt;

public class AddressDetails {

	public static void main(String[] args) {
        
		Student std = new Student();
        std.setStdname("Anagha");
        std.setStdroll(101);

        Address adr = new Address();
        adr.setPlace("Gandhi Nagar");
        adr.setStreetname("Main Street");
        adr.setHoseno("HSNo123");
        adr.setStud(std);
        adr.displayDetails();


	}

}
