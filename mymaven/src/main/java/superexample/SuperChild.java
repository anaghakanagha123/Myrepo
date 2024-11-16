package superexample;

public class SuperChild extends SuperParent {

	public SuperChild() {
		
		super(10);
		System.out.println("Super child class constructor ");
		
	}
	public static void main(String[] args) {
		
		SuperChild cld=new SuperChild();

	}

}
