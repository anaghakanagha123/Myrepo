package abstraction_interface_example;

public class InterfaceImplementation implements InterfaceAbstraction03 {

	public int intermethod02(int num1) {
		num1=num1+MAX;
		System.out.println("interface method 02 : num1 value="+num1);
		return num1;
	}

	
	public void intermethod01() 
	{	
		System.out.println("here imeplements interface method01");
		
	}

	public void intermethod03(int num2) {
		num2=VAL+MAX;
		System.out.println("interface method 03 : num2 value="+num2);
		
	}

	public static void main(String[] args) {
		
		InterfaceImplementation intr=new InterfaceImplementation();
		intr.intermethod02(20);
		intr.intermethod01();
		intr.intermethod03(10);

}
}